Дина Галевска 216018
1.
2.
![](../Untitled Diagram.drawio.png)


3. Цикломатската комплексност е 11. Ја одредив така што ги изброив регионите кои се означени и на сликата погоре.

4.
![](../EveryBranch.png)
•	Првиот тест случај одговара на Exception, па ги изминува само гранките: a-b, b-w

•	Со вториот тест случај се изминува само четвртиот услов, со што се изминуваат гранките наведени во excel табелата погоре означени со 1.

•	Се додаваат останатите три тест случаи за да се изминат сите гранки. Со третиот тест случај се изминува вториот услов, третиот, условите во циклусот како и делот во else, а со четвртиот тест случај се изминуваат и гранките v-w и q,r-v, но фали да се измине уште една гранка s2-v, па затоа е потребен и петтиот тест случај така што би се изминале сите гранки.

5.
![](../Picture4.png)
Имаме 4 можни ситуации:

•	(T,X,X) - тука како test case user=null(не постои корисник) бидејќи е прв аргумент, би се исполнил условот, така што следните два аргументи би можеле да бидат што било.

•	(F,T,X) - тука постои корисник и како аргументи за test case имаме User: username=Dina, password=null, whatever, односно со тоа што username е различно од null првиот дел од if- ot e false па продолжуваме со пасворд password = null каде што се исполнува овој услов и како трет аргумент може да стои било што. 

•	(F,F,T) - User: username=Dina, password=finki123/!, email=null, првите два аргументи се погрешни и за да се исполни овој тест случај како трет аргумент email=null. 

Со овие три тест случаи се изминуваат овие гранки: a-b, b-w. Односно исполнет е првиот услов со што се фрла исклучок и се излегува од функцијата.

•	(F,F,F) – User: username=null, password=mesec 123$,email=dina@gmail.com. Тука имаме ситуација така што корисникот постои, има пасворд и mail. И како листа од корисници испраќаме Users: username:Bojana, pass=bojana123,email=bojana@gmail.com, username=dina@gmail.com, pass=mesec 123$,email=dina@gmail.com. Со овој тест би се поминале следните гранки: a-c; c-d; d-e,f; e, f-g,h1; g,h1-h2; h2-I,j; I,j-l; l-h3; I,j-k; k-l; l-m; m-h3; h3-h2; h2-n,o; n,o-q,r; q,r-v; v-w. Со овој случај се исполнуваат вториот услов, третиот, условите внатре во циклусот при втората итерација, а во предпоследниот if не влегуваме, но ниту пак во else бидејќи во пасвордот има празно место. Односно одиме во последната линија во функцијата return false означена со латиничната буква v, па од неа и излегуваме од функцијата(буква w)
6. Објаснувањето на напишаните unit тестови е следното:

•	Кога се користи assertFalse, се проверува дали одреден услов/израз не е точен. Доколку условот/изразот е точен (true), ќе се смета дека тестот е неуспешен и ќе се прикаже порака за грешка.

•	assertTrue се користи за да се провери дали одреден услов/израз е точен. Доколку условот/изразот е точен, тестот ќе се смета за успешен. Доколку условот/изразот е неточен (false), ќе се смета дека тестот не успеал и ќе се прикаже порака за грешка.

•	assertThrows се користи за да се провери дали одреден дел од кодот ќе фрли очекуван исклучок. Оваа проверка помага да се обезбеди дека кодот коректно го фрла исклучокот во одредени ситуации.

Овие тестови ја проверуваат функционалноста

