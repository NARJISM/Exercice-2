Executez et essayez de connecter un Radiateur, cela n'est pas possible

Ouvrez un terminal et déplacez-vous dans le répertoire target/classes

Créez une archive avec la commande : jar cvf Appli.jar *.class

Déplacez-vous dans le répertoire nouveauConnectable : cd ../../nouveauConnectable

Copiez-y l'archive : cp ../target/classes/Appli.jar .

Compilez le fichier Radiateur.java : javac -cp Appli.jar Radiateur.java

Executez : java -cp "Appli.jar:." AppliDomotique

Sous Windows, remplacez les / par \ et les : par ;
