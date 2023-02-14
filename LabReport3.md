# CSE 15L Lab Report 2

***Grep*** 

- Grep searches the in the inputted file for the word/string that is inserted in quotation marks.

> An example of grep: 

``` command
travel_guides:508$ 
cd ~/skill-demo1-server/skill-demo1-data/written_2/travel_guides/berlitz2
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
The Reconquest of Silves, not achieved for another 50 years, was a grisly affair. A mixed bag of Crusaders from northern Europe were recruited en route to their battles east in the Holy Land. They sailed upon the river port of Silves and, ignoring conditional offers of surrender, slew all the inhabitants (at no small loss to themselves) and pillaged the great treasures of the city.
During Henry’s lifetime, Portugal’s caravels sailed beyond the most westerly point of Africa. They colonized the Atlantic islands of Madeira and the Azores, laying the foundations for the future Portuguese empire. Before the century was over, Henry’s compatriots Bartolomeu Dias and Vasco da Gama completed epic voyages, rounding the Cape of Good Hope and reaching India, respectively, and Pedro Álves Cabral claimed Brazil. Between 1519 and 1522 another Portuguese explorer, Ferdinand Magellan, led the first expedition to circumnavigate the world. Mercantilist Portugal became a rich maritime superpower.
