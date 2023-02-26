# CSE 15L Lab Report 3

***Grep*** 

- Grep searches in the stated file for the word/string that is inserted in quotation marks.

> An example of grep: 

```console
travel_guides:508$ cd ~/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2
berlitz2:509$ ls
Algarve-History.txt      Bali-History.txt         Budapest-History.txt         China-WhereToGo.txt       NewOrleans-History.txt
Algarve-Intro.txt        Bali-WhatToDo.txt        Budapest-WhatToDo.txt        Costa-History.txt         Paris-WhatToDo.txt
Algarve-WhatToDo.txt     Bali-WhereToGo.txt       Budapest-WhereoGo.txt        Costa-WhatToDo.txt        Paris-WhereToGo.txt
Algarve-WhereToGo.txt    Barcelona-History.txt    California-History.txt       Costa-WhereToGo.txt       Poland-History.txt
Amsterdam-History.txt    Barcelona-WhatToDo.txt   California-WhatToDo.txt      CostaBlanca-History.txt   Poland-WhatToDo.txt
Amsterdam-Intro.txt      Barcelona-WhereToGo.txt  California-WhereToGo.txt     CostaBlanca-WhatToDo.txt  Portugal-History.txt
Amsterdam-WhatToDo.txt   Beijing-History.txt      Canada-History.txt           Crete-History.txt         Portugal-WhatToDo.txt
Amsterdam-WhereToGo.txt  Beijing-WhatToDo.txt     Canada-WhereToGo.txt         Crete-WhatToDo.txt        Portugal-WhereToGo.txt
Athens-History.txt       Beijing-WhereToGo.txt    CanaryIslands-History.txt    Crete-WhereToGo.txt       PuertoRico-History.txt
Athens-Intro.txt         Berlin-History.txt       CanaryIslands-WhatToDo.txt   CstaBlanca-WhereToGo.txt  PuertoRico-WhatToDo.txt
Athens-WhatToDo.txt      Berlin-WhatToDo.txt      CanaryIslands-WhereToGo.txt  Cuba-History.txt          PuertoRico-WhereToGo.txt
Athens-WhereToGo.txt     Berlin-WhereToGo.txt     Cancun-History.txt           Cuba-WhatToDo.txt         Vallarta-History.txt
Bahamas-History.txt      Bermuda-WhatToDo.txt     Cancun-WhatToDo.txt          Cuba-WhereToGo.txt        Vallarta-WhatToDo.txt
Bahamas-Intro.txt        Bermuda-WhereToGo.txt    Cancun-WhereToGo.txt         Nepal-History.txt         Vallarta-WhereToGo.txt
Bahamas-WhatToDo.txt     Bermuda-history.txt      China-History.txt            Nepal-WhatToDo.txt      
Bahamas-WhereToGo.txt    Boston-WhereToGo.txt     China-WhatToDo.txt           Nepal-WhereToGo.txt
berlitz2:512$ grep "sailed" Algarve-History.txt
The Reconquest of Silves, not achieved for another 50 years, was a grisly affair. A mixed bag of Crusaders from 
northern Europe were recruited en route to their battles east in the Holy Land. They sailed upon the river port 
of Silves and, ignoring conditional offers of surrender, slew all the inhabitants (at no small loss to themselves)
and pillaged the great treasures of the city.
During Henry’s lifetime, Portugal’s caravels sailed beyond the most westerly point of Africa. They colonized the
Atlantic islands of Madeira and the Azores, laying the foundations for the future Portuguese empire. Before the 
century was over, Henry’s compatriots Bartolomeu Dias and Vasco da Gama completed epic voyages, rounding the Cape 
of Good Hope and reaching India, respectively, and Pedro Álves Cabral claimed Brazil. Between 1519 and 1522 another
Portuguese explorer, Ferdinand Magellan, led the first expedition to circumnavigate the world. Mercantilist Portugal 
became a rich maritime superpower.
```
- &uarr; The command above ```grep "sailed" Algarve-History.txt``` searched for "sailed" in the file Algarve-History.txt, then returns back the line
that contains the searched word. 

>__Note__: These results can also be saved in a file that you create using the ```>``` operator:

```console
berlitz2:513$ grep "sailed" Algarve-History.txt > grep-results.txt
berlitz2:514$ ls
Algarve-History.txt      Bali-History.txt         Budapest-History.txt         China-WhereToGo.txt       NewOrleans-History.txt
Algarve-Intro.txt        Bali-WhatToDo.txt        Budapest-WhatToDo.txt        Costa-History.txt         Paris-WhatToDo.txt
Algarve-WhatToDo.txt     Bali-WhereToGo.txt       Budapest-WhereoGo.txt        Costa-WhatToDo.txt        Paris-WhereToGo.txt
Algarve-WhereToGo.txt    Barcelona-History.txt    California-History.txt       Costa-WhereToGo.txt       Poland-History.txt
Amsterdam-History.txt    Barcelona-WhatToDo.txt   California-WhatToDo.txt      CostaBlanca-History.txt   Poland-WhatToDo.txt
Amsterdam-Intro.txt      Barcelona-WhereToGo.txt  California-WhereToGo.txt     CostaBlanca-WhatToDo.txt  Portugal-History.txt
Amsterdam-WhatToDo.txt   Beijing-History.txt      Canada-History.txt           Crete-History.txt         Portugal-WhatToDo.txt
Amsterdam-WhereToGo.txt  Beijing-WhatToDo.txt     Canada-WhereToGo.txt         Crete-WhatToDo.txt        Portugal-WhereToGo.txt
Athens-History.txt       Beijing-WhereToGo.txt    CanaryIslands-History.txt    Crete-WhereToGo.txt       PuertoRico-History.txt
Athens-Intro.txt         Berlin-History.txt       CanaryIslands-WhatToDo.txt   CstaBlanca-WhereToGo.txt  PuertoRico-WhatToDo.txt
Athens-WhatToDo.txt      Berlin-WhatToDo.txt      CanaryIslands-WhereToGo.txt  Cuba-History.txt          PuertoRico-WhereToGo.txt
Athens-WhereToGo.txt     Berlin-WhereToGo.txt     Cancun-History.txt           Cuba-WhatToDo.txt         Vallarta-History.txt
Bahamas-History.txt      Bermuda-WhatToDo.txt     Cancun-WhatToDo.txt          Cuba-WhereToGo.txt        Vallarta-WhatToDo.txt
Bahamas-Intro.txt        Bermuda-WhereToGo.txt    Cancun-WhereToGo.txt         Nepal-History.txt         Vallarta-WhereToGo.txt
Bahamas-WhatToDo.txt     Bermuda-history.txt      China-History.txt            Nepal-WhatToDo.txt        grep-results.txt
Bahamas-WhereToGo.txt    Boston-WhereToGo.txt     China-WhatToDo.txt           Nepal-WhereToGo.txt
berlitz2:515$ cat grep-results.txt
The Reconquest of Silves, not achieved for another 50 years, was a grisly affair. A mixed bag of Crusaders from 
northern Europe were recruited en route to their battles east in the Holy Land. They sailed upon the river port 
of Silves and, ignoring conditional offers of surrender, slew all the inhabitants (at no small loss to themselves) 
and pillaged the great treasures of the city.
During Henry’s lifetime, Portugal’s caravels sailed beyond the most westerly point of Africa. They colonized the 
Atlantic islands of Madeira and the Azores, laying the foundations for the future Portuguese empire. Before the 
century was over, Henry’s compatriots Bartolomeu Dias and Vasco da Gama completed epic voyages, rounding the Cape 
of Good Hope and reaching India, respectively, and Pedro Álves Cabral claimed Brazil. Between 1519 and 1522 another 
Portuguese explorer, Ferdinand Magellan, led the first expedition to circumnavigate the world. Mercantilist Portugal
became a rich maritime superpower.
```
- &uarr; The command above ```grep "sailed" Algarve-History.txt > grep-results.txt``` searched for "sailed" in the file Algarve-History.txt, then returns back the line that contains the searched word and stores it in grep-results.txt.

***Grep -r***

- Grep -r where -r means recursive will search for the inputted word/string in the every file of the given directory

> An example of grep -r:

```console 
travel_guides:545$ grep -r "palms" ~/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2 > grep-results.txt
travel_guides:550$ ls
berlitz1  berlitz2  grep-results.txt
travel_guides:546$ cat grep-results.txt
/home/linux/ieng6/cs15lwi23/cs15lwi23acp/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt:Two of the Berry Islands offer tourist facilities. Chub Cay, nearest to Nassau, is a favored sport-fishing resort — anglers sail out from here to the northern tip of the Tongue of the Ocean to catch marlin. Scuba divers and snorkelers enjoy the shallow reefs close to the island. The shallow coral reef off Mamma Rhoda Rock, a brief motorboat ride from Chub Cay marina, is an outstanding experience. Great Harbour Cay, covered with silver-top palms and sea grape, is a pretty island with a number of marvelous beaches. At the impressive marina, yachtsmen — many visiting from the Florida coast — park in slips beneath their townhouses.
/home/linux/ieng6/cs15lwi23/cs15lwi23acp/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bali-WhereToGo.txt:Farther south, the dry scrub-covered hills slowly give way to semi-desert, with an occasional grove of coconut palms playing the role of oasis. Energetic resurfacing and new construction has transformed the road, but Kuta Beach is still far from resembling its namesake in Bali. Most of the time, its white coral sands are largely deserted. Most accommodations are still in simple cottages, some with a modest restaurant as well. Otherwise you can find a cheap warung. Novotel’s Mandalika Resort, designed to resemble a Sasak Village by the sands of Kuta Beach, is the one upscale vacation complex in the area. Hotels in the area can arrange transportation to some of the beautiful, isolated beaches nearby. The Sunday morning market at the hamlet of Kuta is lively and interesting. Once a year in February or March, a few days after the second full moon of the year, crowds gather on the beach for Bau Nyale. The all-night festival is timed to coincide with the hatching of strange worms from the sea bed.
/home/linux/ieng6/cs15lwi23/cs15lwi23acp/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt:You will come first to the Arboretum (bus route #3), 9 hectares (22 acres) of lawns and woods filled with native trees. Separate swathes of land concentrate on collections of ficus and palms, with an area of general woodland beyond. It’s a great place for children to run wild or explore in the undergrowth.
/home/linux/ieng6/cs15lwi23/cs15lwi23acp/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt:Middle Road eventually reaches the village of Flatts at the edge of Harrington Sound. The sound, some 3 km (2 miles) in diameter, is thought to be a huge caldera that formed after a powerful volcanic eruption. Some areas of this inland sea are immensely deep, attracting marine creatures to the safe waters. Boats also take advantage of the protective shield, and in summer (April–October) diving and snorkeling are popular pastimes. A narrow bridge fords the gap between the sound and the open sea through Flatts Inlet. The tidal waters are constantly flowing in and out through the 9-m (30-ft) opening. A number of boats rest on the waters of Flatts Inlet, which is one of the most photogenic spots on the island. The waters have a translucent turquoise hue that appears almost artificial, and the swaying palms create a truly tropical scene.
(etc.)
```
- &uarr; The command above ```grep -r "palms" ~/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2 > grep-results.txt``` searched for "palms" in the directory berlitz2, then returns back the line that contains the searched word and the full path and stores it in grep-results.txt.

> Another example of grep -r:

```console 
skill-demo1-data:547$ ls
written_2
skill-demo1-data:543$ grep -r "Puerta de Tierra"  
written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt:Toward the end of the 18th century, the city fathers realized that San Juan was becoming overcrowded, so they decided to break through a section of the vast wall and expand the city’s borders. Gangs of laborers were hired to carry out the job (you can see photographs of them in Fuerte San Cristóbal). This action altered the perception that San Juan was a citadel city — already an anachronism at the time — and plans were drawn up to develop the area immediately east of the city, an area that became known as Puerta de Tierra or “gateway to the land.” Today, San Juan stretches all the way around the bay. A number of the modern suburbs, though primarily residential, have some interesting attractions for visitors.
grep-results.txt:written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt:Toward the end of the 18th century, the city fathers realized that San Juan was becoming overcrowded, so they decided to break through a section of the vast wall and expand the city’s borders. Gangs of laborers were hired to carry out the job (you can see photographs of them in Fuerte San Cristóbal). This action altered the perception that San Juan was a citadel city — already an anachronism at the time — and plans were drawn up to develop the area immediately east of the city, an area that became known as Puerta de Tierra or “gateway to the land.” Today, San Juan stretches all the way around the bay. A number of the modern suburbs, though primarily residential, have some interesting attractions for visitors.
grep-results2.txt:written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt:Toward the end of the 18th century, the city fathers realized that San Juan was becoming overcrowded, so they decided to break through a section of the vast wall and expand the city’s borders. Gangs of laborers were hired to carry out the job (you can see photographs of them in Fuerte San Cristóbal). This action altered the perception that San Juan was a citadel city — already an anachronism at the time — and plans were drawn up to develop the area immediately east of the city, an area that became known as Puerta de Tierra or “gateway to the land.” Today, San Juan stretches all the way around the bay. A number of the modern suburbs, though primarily residential, have some interesting attractions for visitors.
grep-results2.txt:grep-results.txt:written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt:Toward the end of the 18th century, the city fathers realized that San Juan was becoming overcrowded, so they decided to break through a section of the vast wall and expand the city’s borders. Gangs of laborers were hired to carry out the job (you can see photographs of them in Fuerte San Cristóbal). This action altered the perception that San Juan was a citadel city — already an anachronism at the time — and plans were drawn up to develop the area immediately east of the city, an area that became known as Puerta de Tierra or “gateway to the land.” Today, San Juan stretches all the way around the bay. A number of the modern suburbs, though primarily residential, have some interesting attractions for visitors.
```

- &uarr; The command above ```grep -r "Puerta de Tierra"``` searched for "Puerta de Tierra" in the directory berlitz2, then returns back the line that contains the searched word and the full path and stores it in grep-results.txt. Recursive is very useful when you dont know which file contains the word you are searching for or if the directory contains large amounts of files.


***Grep -l***

- Grep -l returns back the file that contains the word that is listed. This can be paired with Grep -r to look in a directory.

> An example of grep -l:

```console 
travel_guides:556$ ls
berlitz1  berlitz2
travel_guides:557$ cd ./berlitz2
berlitz2:559$ grep -l "San Diego" California-History.txt 
California-History.txt
berlitz2:561$ grep -l "kmfkbdakfb" California-History.txt 
berlitz2:561$
```
- &uarr; The command above ```grep -l "San Diego" California-History.txt ``` searched for "San Diego" in the file California-History.txt, then returns back the file that contains San Diego. Notice above when I try to find the word "kmfkbdakfb" in the file California-History.txt nothing is returned, meaning that word is not in California-History.txt.

> An example of grep -l -r being used together:

``` console
skill-demo1-data:564$ ls
written_2
skill-demo1-data:565$ grep -l -r "sail" written_2 > grep-results.txt
skill-demo1-data:566$ ls
grep-results.txt  written_2
skill-demo1-data:567$ cat grep-results.txt
written_2/non-fiction/OUP/Castro/chZ.txt
written_2/non-fiction/OUP/Fletcher/ch9.txt
written_2/non-fiction/OUP/Kauffman/ch4.txt
written_2/travel_guides/berlitz1/HandRIsrael.txt
written_2/travel_guides/berlitz1/HandRJamaica.txt
written_2/travel_guides/berlitz1/HistoryEgypt.txt
written_2/travel_guides/berlitz1/HistoryFrance.txt
written_2/travel_guides/berlitz1/HistoryIbiza.txt
written_2/travel_guides/berlitz1/HistoryIndia.txt
written_2/travel_guides/berlitz1/HistoryItaly.txt
written_2/travel_guides/berlitz1/HistoryJamaica.txt
written_2/travel_guides/berlitz1/HistoryMadeira.txt
written_2/travel_guides/berlitz1/HistoryMalaysia.txt
written_2/travel_guides/berlitz1/HistoryMallorca.txt
written_2/travel_guides/berlitz1/IntroGreek.txt
written_2/travel_guides/berlitz1/IntroMallorca.txt
written_2/travel_guides/berlitz1/WhatToFWI.txt
written_2/travel_guides/berlitz1/WhatToFrance.txt
written_2/travel_guides/berlitz1/WhatToGreek.txt
written_2/travel_guides/berlitz1/WhatToHongKong.txt
written_2/travel_guides/berlitz1/WhatToIbiza.txt
written_2/travel_guides/berlitz1/WhatToIsrael.txt
written_2/travel_guides/berlitz1/WhatToIstanbul.txt
written_2/travel_guides/berlitz1/WhatToJamaica.txt
written_2/travel_guides/berlitz1/WhatToLakeDistrict.txt
written_2/travel_guides/berlitz1/WhatToLosAngeles.txt
written_2/travel_guides/berlitz1/WhatToMalaysia.txt
written_2/travel_guides/berlitz1/WhatToMallorca.txt
written_2/travel_guides/berlitz1/WhereToEgypt.txt
written_2/travel_guides/berlitz1/WhereToFWI.txt
written_2/travel_guides/berlitz1/WhereToFrance.txt
written_2/travel_guides/berlitz1/WhereToGreek.txt
written_2/travel_guides/berlitz1/WhereToHongKong.txt
written_2/travel_guides/berlitz1/WhereToIbiza.txt
written_2/travel_guides/berlitz1/WhereToIndia.txt
written_2/travel_guides/berlitz1/WhereToItaly.txt
written_2/travel_guides/berlitz1/WhereToJapan.txt
written_2/travel_guides/berlitz1/WhereToMadrid.txt
written_2/travel_guides/berlitz1/WhereToMalaysia.txt
written_2/travel_guides/berlitz1/WhereToMallorca.txt
written_2/travel_guides/berlitz2/Algarve-History.txt
written_2/travel_guides/berlitz2/Algarve-Intro.txt
written_2/travel_guides/berlitz2/Algarve-WhatToDo.txt
written_2/travel_guides/berlitz2/Algarve-WhereToGo.txt
written_2/travel_guides/berlitz2/Amsterdam-History.txt
written_2/travel_guides/berlitz2/Amsterdam-WhatToDo.txt
written_2/travel_guides/berlitz2/Amsterdam-WhereToGo.txt
written_2/travel_guides/berlitz2/Athens-WhatToDo.txt
written_2/travel_guides/berlitz2/Athens-WhereToGo.txt
written_2/travel_guides/berlitz2/Bahamas-History.txt
written_2/travel_guides/berlitz2/Bahamas-Intro.txt
written_2/travel_guides/berlitz2/Bahamas-WhatToDo.txt
written_2/travel_guides/berlitz2/Bahamas-WhereToGo.txt
written_2/travel_guides/berlitz2/Bali-WhatToDo.txt
written_2/travel_guides/berlitz2/Bali-WhereToGo.txt
written_2/travel_guides/berlitz2/Barcelona-WhatToDo.txt
written_2/travel_guides/berlitz2/Barcelona-WhereToGo.txt
written_2/travel_guides/berlitz2/Berlin-History.txt
written_2/travel_guides/berlitz2/Berlin-WhatToDo.txt
written_2/travel_guides/berlitz2/Bermuda-WhatToDo.txt
written_2/travel_guides/berlitz2/Bermuda-WhereToGo.txt
written_2/travel_guides/berlitz2/Bermuda-history.txt
written_2/travel_guides/berlitz2/Boston-WhereToGo.txt
written_2/travel_guides/berlitz2/California-History.txt
written_2/travel_guides/berlitz2/California-WhatToDo.txt
written_2/travel_guides/berlitz2/California-WhereToGo.txt
written_2/travel_guides/berlitz2/Canada-History.txt
written_2/travel_guides/berlitz2/Canada-WhereToGo.txt
written_2/travel_guides/berlitz2/CanaryIslands-History.txt
written_2/travel_guides/berlitz2/CanaryIslands-WhatToDo.txt
written_2/travel_guides/berlitz2/CanaryIslands-WhereToGo.txt
written_2/travel_guides/berlitz2/Cancun-History.txt
written_2/travel_guides/berlitz2/Cancun-WhatToDo.txt
written_2/travel_guides/berlitz2/Cancun-WhereToGo.txt
written_2/travel_guides/berlitz2/China-History.txt
written_2/travel_guides/berlitz2/China-WhereToGo.txt
written_2/travel_guides/berlitz2/Costa-WhatToDo.txt
written_2/travel_guides/berlitz2/Costa-WhereToGo.txt
written_2/travel_guides/berlitz2/CostaBlanca-History.txt
written_2/travel_guides/berlitz2/CostaBlanca-WhatToDo.txt
written_2/travel_guides/berlitz2/Crete-WhatToDo.txt
written_2/travel_guides/berlitz2/Crete-WhereToGo.txt
written_2/travel_guides/berlitz2/CstaBlanca-WhereToGo.txt
written_2/travel_guides/berlitz2/Cuba-History.txt
written_2/travel_guides/berlitz2/Cuba-WhatToDo.txt
written_2/travel_guides/berlitz2/Cuba-WhereToGo.txt
written_2/travel_guides/berlitz2/NewOrleans-History.txt
written_2/travel_guides/berlitz2/Paris-WhereToGo.txt
written_2/travel_guides/berlitz2/Portugal-History.txt
written_2/travel_guides/berlitz2/Portugal-WhatToDo.txt
written_2/travel_guides/berlitz2/Portugal-WhereToGo.txt
written_2/travel_guides/berlitz2/PuertoRico-History.txt
written_2/travel_guides/berlitz2/PuertoRico-WhatToDo.txt
written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
written_2/travel_guides/berlitz2/Vallarta-History.txt
written_2/travel_guides/berlitz2/Vallarta-WhatToDo.txt
written_2/travel_guides/berlitz2/Vallarta-WhereToGo.txt
```
- &uarr; The command above ```grep -l -r "sail" written_2 > grep-results.txt``` searched for "sailed" in the directory written_2, then returns back the path that contains sailed. This can be used to find out where the word is located when a directory contains multipule sub directories. This can als be helpful to see if a certain file contains a keyword that we are searching for. 

***Grep -c***

- Grep -c returns back a count of how many times the word that is searched for is inside of the inputted file

> An example of grep -c:

```console
berlitz2:581$ pwd    
/home/linux/ieng6/cs15lwi23/cs15lwi23acp/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2
berlitz2:580$ ls
Algarve-History.txt      Bahamas-Intro.txt        Berlin-WhatToDo.txt       Canada-WhereToGo.txt         CostaBlanca-History.txt   Paris-WhatToDo.txt
Algarve-Intro.txt        Bahamas-WhatToDo.txt     Berlin-WhereToGo.txt      CanaryIslands-History.txt    CostaBlanca-WhatToDo.txt  Paris-WhereToGo.txt
Algarve-WhatToDo.txt     Bahamas-WhereToGo.txt    Bermuda-WhatToDo.txt      CanaryIslands-WhatToDo.txt   Crete-History.txt         Poland-History.txt
Algarve-WhereToGo.txt    Bali-History.txt         Bermuda-WhereToGo.txt     CanaryIslands-WhereToGo.txt  Crete-WhatToDo.txt        Poland-WhatToDo.txt
Amsterdam-History.txt    Bali-WhatToDo.txt        Bermuda-history.txt       Cancun-History.txt           Crete-WhereToGo.txt       Portugal-History.txt
Amsterdam-Intro.txt      Bali-WhereToGo.txt       Boston-WhereToGo.txt      Cancun-WhatToDo.txt          CstaBlanca-WhereToGo.txt  Portugal-WhatToDo.txt
Amsterdam-WhatToDo.txt   Barcelona-History.txt    Budapest-History.txt      Cancun-WhereToGo.txt         Cuba-History.txt          Portugal-WhereToGo.txt
Amsterdam-WhereToGo.txt  Barcelona-WhatToDo.txt   Budapest-WhatToDo.txt     China-History.txt            Cuba-WhatToDo.txt         PuertoRico-History.txt
Athens-History.txt       Barcelona-WhereToGo.txt  Budapest-WhereoGo.txt     China-WhatToDo.txt           Cuba-WhereToGo.txt        PuertoRico-WhatToDo.txt
Athens-Intro.txt         Beijing-History.txt      California-History.txt    China-WhereToGo.txt          Nepal-History.txt         PuertoRico-WhereToGo.txt
Athens-WhatToDo.txt      Beijing-WhatToDo.txt     California-WhatToDo.txt   Costa-History.txt            Nepal-WhatToDo.txt        Vallarta-History.txt
Athens-WhereToGo.txt     Beijing-WhereToGo.txt    California-WhereToGo.txt  Costa-WhatToDo.txt           Nepal-WhereToGo.txt       Vallarta-WhatToDo.txt
Bahamas-History.txt      Berlin-History.txt       Canada-History.txt        Costa-WhereToGo.txt          NewOrleans-History.txt    Vallarta-WhereToGo.txt
berlitz2:582$ grep -c "the" Algarve-History.txt 
32
```
- &uarr; The command above ```grep -c "the" Algarve-History.txt``` searched for "the" in the file Algarve-History.txt, then returns back the number of times the word was present in this file. 

>An example of grep -c -r:

```console
travel_guides:563$ ls        
berlitz1  berlitz2
travel_guides:564$ grep -r -c "the" berlitz2
berlitz2/Algarve-History.txt:32
berlitz2/Algarve-Intro.txt:21
berlitz2/Algarve-WhatToDo.txt:43
berlitz2/Algarve-WhereToGo.txt:147
berlitz2/Amsterdam-History.txt:37
berlitz2/Amsterdam-Intro.txt:13
berlitz2/Amsterdam-WhatToDo.txt:43
berlitz2/Amsterdam-WhereToGo.txt:120
berlitz2/Athens-History.txt:44
berlitz2/Athens-Intro.txt:15
berlitz2/Athens-WhatToDo.txt:45
berlitz2/Athens-WhereToGo.txt:126
berlitz2/Bahamas-History.txt:30
berlitz2/Bahamas-Intro.txt:17
berlitz2/Bahamas-WhatToDo.txt:45
berlitz2/Bahamas-WhereToGo.txt:130
berlitz2/Bali-History.txt:25
berlitz2/Bali-WhatToDo.txt:42
berlitz2/Bali-WhereToGo.txt:165
berlitz2/Barcelona-History.txt:22
berlitz2/Barcelona-WhatToDo.txt:33
berlitz2/Barcelona-WhereToGo.txt:124
berlitz2/Beijing-History.txt:24
berlitz2/Beijing-WhatToDo.txt:45
berlitz2/Beijing-WhereToGo.txt:113
berlitz2/Berlin-History.txt:45
berlitz2/Berlin-WhatToDo.txt:40
berlitz2/Berlin-WhereToGo.txt:168
berlitz2/Bermuda-WhatToDo.txt:62
berlitz2/Bermuda-WhereToGo.txt:97
berlitz2/Bermuda-history.txt:29
berlitz2/Boston-WhereToGo.txt:149
berlitz2/Budapest-History.txt:34
berlitz2/Budapest-WhatToDo.txt:49
berlitz2/Budapest-WhereoGo.txt:155
berlitz2/California-History.txt:40
berlitz2/California-WhatToDo.txt:49
berlitz2/California-WhereToGo.txt:151
berlitz2/Canada-History.txt:71
berlitz2/Canada-WhereToGo.txt:423
berlitz2/CanaryIslands-History.txt:28
berlitz2/CanaryIslands-WhatToDo.txt:50
berlitz2/CanaryIslands-WhereToGo.txt:117
berlitz2/Cancun-History.txt:21
berlitz2/Cancun-WhatToDo.txt:44
berlitz2/Cancun-WhereToGo.txt:110
berlitz2/China-History.txt:63
berlitz2/China-WhatToDo.txt:42
berlitz2/China-WhereToGo.txt:415
berlitz2/Costa-History.txt:33
berlitz2/Costa-WhatToDo.txt:42
berlitz2/Costa-WhereToGo.txt:137
berlitz2/CostaBlanca-History.txt:27
berlitz2/CostaBlanca-WhatToDo.txt:75
berlitz2/Crete-History.txt:33
berlitz2/Crete-WhatToDo.txt:50
berlitz2/Crete-WhereToGo.txt:135
berlitz2/CstaBlanca-WhereToGo.txt:115
berlitz2/Cuba-History.txt:27
berlitz2/Cuba-WhatToDo.txt:31
berlitz2/Cuba-WhereToGo.txt:149
berlitz2/Nepal-History.txt:36
berlitz2/Nepal-WhatToDo.txt:81
berlitz2/Nepal-WhereToGo.txt:104
berlitz2/NewOrleans-History.txt:43
berlitz2/Paris-WhatToDo.txt:31
berlitz2/Paris-WhereToGo.txt:146
berlitz2/Poland-History.txt:37
berlitz2/Poland-WhatToDo.txt:36
berlitz2/Portugal-History.txt:39
berlitz2/Portugal-WhatToDo.txt:48
berlitz2/Portugal-WhereToGo.txt:281
berlitz2/PuertoRico-History.txt:22
berlitz2/PuertoRico-WhatToDo.txt:57
berlitz2/PuertoRico-WhereToGo.txt:116
berlitz2/Vallarta-History.txt:32
berlitz2/Vallarta-WhatToDo.txt:61
berlitz2/Vallarta-WhereToGo.txt:111
```

- &uarr; The command above ```grep -r -c "the" berlitz2``` searched for "the" in the directory berlitz2, then returns back the number of times the word was present in each file. This can be used to count of main keywords are in a file, as grep by it's self will only return the file no matter how many times it is present. This can also be used to find out which files don't contain the certain kerword that is searched. 

***Grep -n***

- Grep -n prints out the line containg the word and the line number.

> An example of grep -n:

```console
berlitz2:553$ ls
Algarve-History.txt      Bahamas-Intro.txt        Berlin-WhatToDo.txt       Canada-WhereToGo.txt         CostaBlanca-History.txt   Paris-WhatToDo.txt
Algarve-Intro.txt        Bahamas-WhatToDo.txt     Berlin-WhereToGo.txt      CanaryIslands-History.txt    CostaBlanca-WhatToDo.txt  Paris-WhereToGo.txt
Algarve-WhatToDo.txt     Bahamas-WhereToGo.txt    Bermuda-WhatToDo.txt      CanaryIslands-WhatToDo.txt   Crete-History.txt         Poland-History.txt
Algarve-WhereToGo.txt    Bali-History.txt         Bermuda-WhereToGo.txt     CanaryIslands-WhereToGo.txt  Crete-WhatToDo.txt        Poland-WhatToDo.txt
Amsterdam-History.txt    Bali-WhatToDo.txt        Bermuda-history.txt       Cancun-History.txt           Crete-WhereToGo.txt       Portugal-History.txt
Amsterdam-Intro.txt      Bali-WhereToGo.txt       Boston-WhereToGo.txt      Cancun-WhatToDo.txt          CstaBlanca-WhereToGo.txt  Portugal-WhatToDo.txt
Amsterdam-WhatToDo.txt   Barcelona-History.txt    Budapest-History.txt      Cancun-WhereToGo.txt         Cuba-History.txt          Portugal-WhereToGo.txt
Amsterdam-WhereToGo.txt  Barcelona-WhatToDo.txt   Budapest-WhatToDo.txt     China-History.txt            Cuba-WhatToDo.txt         PuertoRico-History.txt
Athens-History.txt       Barcelona-WhereToGo.txt  Budapest-WhereoGo.txt     China-WhatToDo.txt           Cuba-WhereToGo.txt        PuertoRico-WhatToDo.txt
Athens-Intro.txt         Beijing-History.txt      California-History.txt    China-WhereToGo.txt          Nepal-History.txt         PuertoRico-WhereToGo.txt
Athens-WhatToDo.txt      Beijing-WhatToDo.txt     California-WhatToDo.txt   Costa-History.txt            Nepal-WhatToDo.txt        Vallarta-History.txt
Athens-WhereToGo.txt     Beijing-WhereToGo.txt    California-WhereToGo.txt  Costa-WhatToDo.txt           Nepal-WhereToGo.txt       Vallarta-WhatToDo.txt
Bahamas-History.txt      Berlin-History.txt       Canada-History.txt        Costa-WhereToGo.txt          NewOrleans-History.txt    Vallarta-WhereToGo.txt
berlitz2:554$ grep -n "California" California-History.txt 
6:The first wave of California immigrants arrived somewhere between 20,000 and 35,000 years ago — wandering Asiatic tribes who entered the American continent via the Bering Strait, which at that time was dry land, or perhaps covered in ice. In the succeeding centuries, their descendants continued to push south and east, and eventually spread out to people the whole of the continent from Alaska to Patagonia. The tribes who decided to settle in what is now California were fortunate in their choice of homeland. The climate was very pleasant, and food was sufficiently plentiful for them to avoid the constant warfare that plagued many tribes elsewhere in the Americas.
9:The first Europeans landed on the California coast in the 16th century — Spanish explorers in search of gold, seeking to extend their Mexican empire northward. In 1542 Juan Rodríguez Cabrillo, a Portuguese mariner in the employ of the Viceroy of Mexico, landed at Point Loma, at the mouth of San Diego harbor. He sailed on past the “Bay of Smokes” (San Pedro in present-day Los Angeles), and on through the Santa Barbara Channel. During a scuffle with Native Americans he broke his leg and contracted gangrene, which was to prove fatal, but his crew pushed on as far as Oregon. They found few good harbors, however, and no sign of gold, and had to return empty-handed.
11:In 1769 the Spanish began to settle in California, establishing a string of military garrisons (presidios) and religious missions. The first was built in San Diego in 1769, and then in 1770 Monterey was founded as capital of Alta (Upper) California. The long peninsula of Baja (Lower) California remained separate and ultimately became part of Mexico.
13:The missionaries remained active well into the 19th century, and encouraged Spanish settlers by establishing California’s first towns, the pueblos. By 1804 they had created a chain of 21 missions that stretched all the way from San Diego north to Sonoma.
16:At this time, California was not considered a particularly attractive proposition by its Spanish overlords. Distracted by the Napoleonic wars raging in Europe, they finally abandoned the territory when Mexico declared its independence in 1821.
18:As far as California was concerned, the Mexican takeover was practically bloodless. In fact, California’s 26 years of rather loose Mexican administration (1822–1848) were characterized by a series of bloodless revolutions. The governorship at Monterey changed hands 11 times in a period of five years, not counting three governors whom Mexico City had dared to impose and whose authority was then completely ignored. There was some half-hearted fighting between northerners and southerners for control of the property and lands left by the Spanish missionaries, half of which was meant to be returned to the Native Americans but never was.
19:California grew into a territory with just one industry — cattle ranching, for the sale of cowhide and tallow. In the meantime, the old crafts were abandoned and California started to earn a reputation as a place of leisure.
21:The first Americans to come to California from the eastern states were Boston fur traders taking the Cape Horn route at the end of the 18th century. They didn’t stay for long, but gradually other traders and fur trappers began to arrive overland through Utah, Nevada, Arizona, and New Mexico, settling only in small numbers until the famous covered wagons began their heroic treks of the 1840s. The hardships the pioneers suffered in the Sierra Nevada mountains, Death Valley, and the Mojave Desert became the stuff of California legend, the most tragic being the fate of 87 pioneers who set out from Illinois in 1846. While attempting to cross the Sierra Nevada, George Donner’s wagon train became snowed in, and from November until February was stuck high in the mountains north of Lake Tahoe, at a point now known as the Donner Pass. Just 47 people survived, and then only by resorting to cannibalism.
22:Just simple farmers seeking a place in the sun to work a piece of land, the pioneers came at a time when territorial expansion was much in vogue — the French in the Pacific and Algeria, the British in Africa and the Far East. The United States was eager to get in on the act and so, during the war with Mexico over the annexation of Texas, California was suddenly regarded as a useful addition to the spoils. United States forces captured Los Angeles in 1847, and the Mexicans capitulated at Cahuenga. A treaty of American annexation of California was signed on 2 February 1848. Meanwhile, unknown to the American and Mexican signatories, gold had been found in the Sierra Nevada foothills only nine days earlier.
27:Lured by the promise of increased federal revenues from the newly discovered gold, the United States Congress admitted California as the 31st state of the Union in 1850.
30:The Chinese arrived in the wake of the great Taiping Rebellion of 1851, seeking security and prosperity in what they were told were California’s “Golden Mountains.” They suffered both exploitation by Chinese entrepreneurs, who used them as indentured labor, and discriminatory taxation by the state legislature. The worst-treated, however, were the Native Americans, whose numbers dwindled rapidly not only as a result of disease and malnutrition but also because of systematic massacres in the 1850s by Californian militia.
31:In 1859 the discovery of silver (the Comstock Lode in western Nevada) caused a Silver Rush in the reverse direction, with the mining being organized almost completely from California. As the state’s economy expanded, its major priority became a transcontinental railway to connect it to the eastern markets. Engineer Theodore Judah defied all the experts by plotting a railway link between Sacramento and the East, passing right through the heart of the Sierra Nevada and the Rocky mountains. He managed to sell his idea to a San Francisco consortium that became known as the Central Pacific’s “Big Four” — Mark Hopkins, Collis Huntington, Charles Crocker, and Leland Stanford, names that continue to echo in both the streets and institutions of present-day California.
34:The more devout Californians were convinced God was punishing San Francisco for its gold lust and sinfulness when an earthquake, registering 8.25 on the Richter Scale, struck the city at 5:13am on 18 April 1906. The initial quake wiped out about 5,000 buildings, but the great fire that followed destroyed most of the city. With the water mains shattered, the City Fire Department could do nothing to stop the fire from spreading out of control.
37:The San Francisco earthquake helped to focus the nation’s attention on the graft and corruption that ran right through the heart of California society. The federal prosecution succeeded in jailing only a handful of the principals involved, but the publicity was enough to make the concept of “reform” a popular one.
39:All kinds of produce grew large and lush in California’s fertile, irrigated soil, but the most financially profitable thing to come out of the Californian earth was oil. Drilling had begun in the 1860s but didn’t take off until 1892. By the 1920s, the derricks of the Standard, Union, and Shell oil companies had sprouted all over the Los Angeles basin. In that one decade, the state’s oil revenues were $2.5 billion, $500 million more than all the gold the Sierras yielded in a century.
46:The Great Depression hit California hard. Income from agriculture dropped by 50 percent between 1929 and 1932, and one-fifth of the state’s population was on public relief. California managed to weather the downturn better than the rest of the country, however, and became a magnet for dispossessed refugees from the Dustbowl of the Midwest. “Okies,” as they were known, packed their families and belongings into rickety cars and trucks to make the epic voyage west to find work in the farms and orchards of California. Their tale of hardship, pride, bitterness, and exploitation is graphically recorded in the Pulitzer Prize–winning novel The Grapes of Wrath, by California writer John Steinbeck.
47:Then came World War II, bringing with it an enormous boom for the state’s beleaguered economy, with the United States federal government spending $35 billion in California. Overnight, ships and planes became the state’s most important products. Manufacturers such as Douglas, Lockheed, and Northrop were all located in the Los Angeles area.
48:In the post-war period California continued to prosper. Agriculture grew up into agribusiness; the film industry expanded into the new field of television; the aircraft industry was boosted by the space program; and semiconductor technology paved the way for Silicon Valley.
51:True to the tradition of California’s indulgence of utopian dreams, the Beat generation of the 1950s made its home in San Francisco’s North Beach district. Writers such as Jack Kerouac and Allen Ginsberg, as well as the poets that hung round Lawrence Ferlinghetti’s City Lights Bookstore, advocated a free and unstructured style of writing, exemplified by Jack Kerouac’s cult novel On the Road.
53:California was also in the forefront of student radicalism, beginning with the Free Speech Movement at Berkeley in 1964, and ending with the violent clashes at San Francisco State University in 1968 and the 1969 Berkeley demonstration in favor of a “People’s Park,” when protesters were sprayed with tear gas.
55:America’s continuous social revolution has always had a prominent place in California life. Pressures for some kind of change have been alternately encouraged and resisted as the state’s volatile political establishment has swung back and forth between conservatives and progressives. Ronald Reagan, a staunch Republican and former Hollywood actor, served as governor of California between 1966 and 1974 and as president of the United States from 1980 to 1988. He was succeeded as governor of California by Jerry Brown, known to many as “Governor Moonbeam.” A left-wing Democrat who espoused Zen Buddhism and the legalization of marijuana, he also imposed environmental protection measures and energy resources long before others began to see the wisdom of such policies. In his current incarnation, Brown is the mayor of Oakland, California.
56:Recent earthquakes — one in San Francisco in 1989 and another that hit Los Angeles in 1994 — have served as reminders that Californians continue to live in the shadow of The Big One — the major earthquake that experts predict will strike in the next 30 years. It says a lot for the attractions of life in California — and the optimism of those who continue to enjoy it — that despite this dire prediction, millions of people still seek their future in the Golden State’s promised land.
```

- &uarr; The command above ```grep -n "California" California-History.txt ``` searched for "California" in the file California-History.txt, then returns back the line containing the word and the line number. 

> An example of grep -n with grep -r:

```console 
travel_guides:527$ ls
berlitz1  berlitz2
travel_guides:532$ grep -r -n "sailed" berlitz2
berlitz2/Algarve-History.txt:12:The Reconquest of Silves, not achieved for another 50 years, was a grisly affair. A mixed bag of Crusaders from northern Europe were recruited en route to their battles east in the Holy Land. They sailed upon the river port of Silves and, ignoring conditional offers of surrender, slew all the inhabitants (at no small loss to themselves) and pillaged the great treasures of the city.
berlitz2/Algarve-History.txt:20:During Henry’s lifetime, Portugal’s caravels sailed beyond the most westerly point of Africa. They colonized the Atlantic islands of Madeira and the Azores, laying the foundations for the future Portuguese empire. Before the century was over, Henry’s compatriots Bartolomeu Dias and Vasco da Gama completed epic voyages, rounding the Cape of Good Hope and reaching India, respectively, and Pedro Álves Cabral claimed Brazil. Between 1519 and 1522 another Portuguese explorer, Ferdinand Magellan, led the first expedition to circumnavigate the world. Mercantilist Portugal became a rich maritime superpower.
berlitz2/Algarve-WhereToGo.txt:102:Until comparatively recently, when the area silted into a tidal flat, Faro was a commercial and fishing port open to the Atlantic. Indeed, the Earl of Essex’s fleet had sailed right up to the city’s Arab fortifications. Today small fishing boats and pleasure craft must zigzag carefully amid the dunes and then creep beneath the railway bridge to enter the sleepy harbor.
berlitz2/Amsterdam-History.txt:34:Expansion quickly peaked however, and the European powers who had carved up the New World set about testing each other in dynastic conflicts and colonial rivalry. The English were the main rivals of the Dutch on the high seas, and there were several wars between the two in the 17th and 18th centuries. In 1665–1667 the Dutch sailed up the River Medway and sank the British fleet moored there.
berlitz2/Bahamas-History.txt:10:In 1648 a group of English Puritans from Bermuda, led by William Sayle, sailed to Bahamian waters and established the first permanent European settlement on the island they named Eleutheria (now Eleuthera) after the Greek word for freedom. The 70 colonists called themselves the Eleutherian Adventurers, but life was very difficult and the colony never flourished, though Sayle was long honored for the effort. In 1666 a smaller island (called Sayle’s island) with a fine harbor was settled by Bermudians and renamed New Providence. It was later to become known as Nassau, capital of the Bahamas.
berlitz2/Bahamas-History.txt:19:News traveled slowly in those days. The Treaty of Versailles in 1783 formally restored the Bahamas to the British, but actual liberation came through a famous escapade that would never have happened in the age of the telegraph. Lieutenant-Colonel Andrew Deveaux, a loyalist from South Carolina, sailed from Florida with six ships, picked up men and fishing boats at Harbour Island and Eleuthera, and “invaded” Nassau. Though vastly outnumbered and outgunned, Deveaux employed elaborate ruses with his little boats to convince the Spanish defenders that his force was overpowering. The humiliating Spanish surrender is proudly recalled in Bahamian history, even though it was all unnecessary: the peace treaty had been signed the previous week.
(etc.)
```
- &uarr; The command above ```grep -r -n "sailed" berlitz2``` searched for "sailed" in the directory berlitz2, then returns back the line containing the word, line number, and relvant path. This is useful because we can now find which exact line contains the searched for word. This allows us to have more information on where the word is located. 

---------------------------------------------------------------***Work Cited***-----------------------------------------------------------------
Information about grep options:

- Using the command (man grep)

- [GrepInfo](https://www.geeksforgeeks.org/grep-command-in-unixlinux/)
