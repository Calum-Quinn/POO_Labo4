# POO - Labo 4

- Groupe: L04GrK
- Etudiants: Calum Quinn, Dylan Ramos

## 1. Tri de tableau d'entiers

Pour récupérer les nombres passés en arguments, nous itérons sur le tableau d'arguments et pour chaque argument, nous
vérifions si le premier caractère est un signe. Ensuite, pour détérminer le nombre, nous itérons sur les caractères de
l'argument et nous multiplions chaque chiffre par la puissance de 10 correspondante. Enfin, nous ajoutons le nombre au
tableau de nombres.

Pour trier le tableau, nous utilisons l'algorithme de tri à bulles comme vu pendant les cours d'ASD.

## 2. Classe Int

Pour l'implémentation de la classe `Int`, nous avons encapsulé le type primitif `int`, puis nous avons implémenté deux
constructeurs, un pour initialiser la valeur à 0 et un autre pour initialiser la valeur à une valeur donnée. Ensuite,
nous avons implémenté un getter et un setter pour consulter et modifier la valeur entière. Enfin, nous avons implémenté
les méthodes d'échange de manière statique sauf pour la méthode `swap` qui échange la valeur de l'instance courante avec
une autre instance (comme demandé au point 3.3).

## 3. Tri de tableau d'objets

L'exercice 3 est très similaire à l'exercice 1, mais au lieu de trier un tableau d'entiers, nous trions un tableau
d'objets `Int`. D'autre part, nous avons dû implémenter une méthode `printArray` pour pouvoir afficher le tableau
d'objets `Int` trié car il n'y a pas de méthode `toString` pour un tableau d'objets `Int`.