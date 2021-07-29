# CloudAccelerationBootcamp

Code base made from the legacy code - modernized for cloud

1. 
1. Fix the initial errors in the legacy code and build into the normal 6.5 jar
	Please note we have to use Java 11. 
2. Run the best practise analyser tool (BPA)
3. Install node and npm
4. Install aio-cli plugin (npm install -g @adobe/aio-cli)
5. Install cloud manager plugin (aio plugins:install @adobe/aio-cli-plugin-aem-cloud-service-migration)
6. Run aio aem-migration:repository-modernizer (we will run only the repository modernizer) with yaml file as per https://github.com/adobe/aio-cli-plugin-aem-cloud-service-migration/blob/master/config/README.md
For windows the file location is 
C:\Users\Administrator\AppData\Local\@adobe\aio-cli
7. Once migration is complete resolve errors and fix the workspace

Some common errors
1. Pom version not copied.
2. WCMUse has to be converted to WCMUsePojo
3. Change the order to allow core to be built first. 
4. Add the sling model dependancy in the mail pom as well

8. Use command mvn verify to check the project
9. Use Command  mvn clean install -PautoInstallPackage to build and deploy package
