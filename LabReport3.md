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

> These results can also be saved in a file that you create using the ```>``` operator:

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

>__Note__: Grep by it's self is useful, but we can make it more efficant with some more command lines. 

***Grep -r ***

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
etc.
```
