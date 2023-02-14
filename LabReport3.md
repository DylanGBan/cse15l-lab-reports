# CSE 15L Lab Report 2

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
- &uarr; The command above ```grep "sailed" Algarve-History.txt``` searched for sailed in the file Algarve-History.txt, then returns back the line
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
- &uarr; The command above ```grep "sailed" Algarve-History.txt > grep-results.txt``` searched for sailed in the file Algarve-History.txt, then returns back the line that contains the searched word and stores it in grep-results.txt.

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
- &uarr; The command above ```grep -r "palms" ~/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2 > grep-results.txt``` searched for palms in the directory berlitz2, then returns back the line that contains the searched word and the full path and stores it in grep-results.txt. Recursive is very useful when you dont know which file contains the word you are searching for or if the directory contains large amounts of files.

***Grep -l***

- Grep -l returns back the path that contains the word that is listed. This can be paired with Grep -r to look in a directory.

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
- &uarr; The command above ```grep -l -r "sail" written_2 > grep-results.txt``` searched for sailed in the directory written_2, then returns back the path that contains sailed. This can be used to find out where the word is located when a directory contains multipule sub directories. 

***Grep -c***

- Grep -c returns back a count of how many times the word that is searched for is inside of the inputted file

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
- &uarr; The command above ```grep -c "the" Algarve-History.txt``` searched for the in the file Algarve-History.txt, then returns back the number of times the was present in this file. This can be used to count of main keywords are in a file, as grep by it's self will only return the file no matter how many times it is present. 
