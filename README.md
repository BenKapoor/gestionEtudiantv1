# gestionetudiant

<b>0- Installation</b>

a- TomcatServer 9.0 | Utilisation de Java v.8.x - 

b- Créer une base mysql à l'aide de wamp qui se nomera `gestionetudiant` et importer le fichier gestionetudiant.sql 
permettant d'avoir des données exemples et de connection.

<b>0bis- Récupération du war</b>

Au niveau de votre disque C, ouvirir une console cmd et ecrire:
`mkdir c:\GTMGestionEtudiant`

`cd c:\GTMGestionEtudiant`

`mvn scm:checkout  -DconnectionUrl=scm:git:https://github.com/BenKapoor/gestionEtudiantv1`

Aller dans `target\checkout\GestionEtudiant`

Exécuter la commande :
`mvn install`

Aller dans le dossier `target` et récupérer le war génréré.

<b>1- Deplacer le fichier `GestionEtudiant.war` dans le dossier `webapps` de Tomcat </b>

<b>2- Executer `startup.bat` situé dans le dossier `bin` de tomcat </b>

<b>3- Dans l'url du navigateur internet, entrer la commande suivante : http://localhost:8080/GestionEtudiant/ </b>

<i>Identifiant pour se connecter :
  
Login : Admin

Mot de passe : password</i>

<b>Fonctionnalités présentes : </b>
- Identification de la direction
- Ajouter un étudiant
- Modifier un étudiant (Utilisation du web service)
- Supprimer un étudiant
- Lister tous les étudiants
- Récupérer le détail d'un étudiant
- Lier un étudiant à un cours


<b>Technologies : </b>
- Servlet
- HTML
- JSP
- Bootstrap
- JPA
- Web service
