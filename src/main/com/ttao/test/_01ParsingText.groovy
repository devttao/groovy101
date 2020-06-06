pipeline {
    environment {
        repo_dir = '/opt/Projects/identity-db'

    }
    agent { label 'jenkinsnode-sj-001-fr' }
    stages
            {
                stage('Build')
                        {
                            steps
                                    {
                                        dir('/opt/Projects/identity-db')
                                                {
                                                    git(url: 'https://webexgitlab.webex.com/jmourrai/identity-db.git',
                                                            credentialsId: 'jmourrai_gitlab',
                                                            branch: 'master'
                                                    )

                                                }

                                    }
                        }
                stage('update')
                        {
                            steps
                                    {
                                        script
                                                {
                                                    if (env.datacenter == "PRODSJC") {
                                                        sh " sudo cp -r $workspace/PROD/db.properties_PRODSJC $repo_dir/db.properties"
                                                        sh "echo update_PRODSJC"

                                                    }


                                                    if (env.datacenter == "PRODDFW") {
                                                        sh " sudo cp -r $workspace/PROD/db.properties_PRODDFW $repo_dir/db.properties"
                                                        sh "echo update_PRODDFW"
                                                    }

                                                }

                                    }

                        }
                stage('update DB_properties')
                        {
                            steps {
                                script
                                        {
                                            if (env.datacenter == "PRODSJC") {
                                                withCredentials([usernamePassword(credentialsId: 'PRODSJC_Credentials', passwordVariable: 'pwd_PRODSJC', usernameVariable: 'usr_PRODSJC')])
                                                        {
                                                            sh "sed -i -e 's/user_PRODSJC/${usr_PRODSJC}/g' -e 's/pass_PRODSJC/${pwd_PRODSJC}/g' $repo_dir/db.properties"
                                                            sh "echo update DBSJC_properties"

                                                        }

                                            }
                                            if (env.datacenter == "PRODDFW") {
                                                withCredentials([usernamePassword(credentialsId: 'pwd_PRODDFW', passwordVariable: 'pwd_PRODDFW', usernameVariable: 'usr_PRODDFW')])
                                                        {
                                                            sh "sed -i -e 's/user_PRODDFW/${usr_PRODDFW}/g' -e 's/pass_PRODDFW/${pwd_PRODDFW}/g' $repo_dir/db.properties"
                                                            sh "echo update PRODDFW_properties"

                                                        }
                                            }

                                        }

                            }

                        }
                stage('Deploy')
                        {
                            steps
                                    {
                                        sh 'sudo $repo_dir/upgrade.sh -a CHECK'
                                        echo "Deployment Completed"

                                    }

                        }
                stage('Version Check')
                        {
                            steps
                                    {
                                        sh 'sudo $repo_dir/upgrade.sh -a CHECK'

                                    }

                        }
            }
    post
            {
                always
                        {
                            sh 'rm -rf $repo_dir'

                        }

            }
}