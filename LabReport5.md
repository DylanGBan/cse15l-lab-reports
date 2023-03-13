# CSE 15L Lab Report 5

***rm***

> An example rm: 

```console
[cs15lwi23acp@ieng6-201]:~:501$ ls
hello  lab7  path-examples  perl5  skill-demo1-server  wavelet
[cs15lwi23acp@ieng6-201]:~:502$ rm hello
[cs15lwi23acp@ieng6-201]:~:503$ ls
lab7  path-examples  perl5  skill-demo1-server  wavelet
[cs15lwi23acp@ieng6-201]:~:504$ 
```

> &uarr; The command `rm hello` removes the hello.txt file from the current directory. 

```console 
[cs15lwi23acp@ieng6-201]:~:517$ ls    
lab7  path-examples  perl5  skill-demo1-server  wavelet
[cs15lwi23acp@ieng6-201]:~:517$ cd path-examples
[cs15lwi23acp@ieng6-201]:path-examples:518$ ls
Read.java  all-java.sh  quiz-layout  some-files
[cs15lwi23acp@ieng6-201]:path-examples:519$ rm Read.java
[cs15lwi23acp@ieng6-201]:path-examples:520$ ls
all-java.sh  quiz-layout  some-files
```
>&uarr; The command `rm Read.java` removes the Read.java from the specific directory that has been cd 
into

**rm - r**

> An example of rm -r 

```console 
[cs15lwi23acp@ieng6-201]:~:510$ cd lab7
[cs15lwi23acp@ieng6-201]:lab7:511$ ls
ListExamples.class  ListExamples.java  ListExamplesTests.class  ListExamplesTests.java  StringChecker.class  lib
[cs15lwi23acp@ieng6-201]:lab7:513$ rm -r lib      
[cs15lwi23acp@ieng6-201]:lab7:514$ ls
ListExamples.class  ListExamples.java  ListExamplesTests.class  ListExamplesTests.java  StringChecker.class
```
> &uarr; The command `rm -r lib` deletes the lib file and all it's contents inside of the file. This is useful and can be used to save time 
for the coder. This can also be useful when trying to experiment with files and having to reset the enviorment every time.

```console
[cs15lwi23acp@ieng6-201]:path-examples:520$ ls
all-java.sh  quiz-layout  some-files
[cs15lwi23acp@ieng6-201]:path-examples:521$ rm -r some-files
[cs15lwi23acp@ieng6-201]:path-examples:522$ ls
all-java.sh  quiz-layout
[cs15lwi23acp@ieng6-201]:path-examples:523$ 
```
>&uarr; The command `rm -r some-files` deletes all the file contents of some-files. This saves major time

**rm -r -f**

> An example of rm -r -f:

```console
[cs15lwi23acp@ieng6-201]:~:501$ ls
lab7  path-examples  perl5  skill-demo1-server  wavelet
[cs15lwi23acp@ieng6-201]:~:502$ rm -r -f lab7
[cs15lwi23acp@ieng6-201]:~:503$ ls
path-examples  perl5  skill-demo1-server  wavelet
[cs15lwi23acp@ieng6-201]:~:504$ 
```
> &uarr; The command `rm -r -f` forcefully deletes all files and sub-directories present in the to be removed directory. This
is extremely useful and time saving because this one command can quickly get rid of that directory entirely.

```console 
[cs15lwi23acp@ieng6-201]:~:507$ ls
path-examples  perl5  skill-demo1-server  wavelet
[cs15lwi23acp@ieng6-201]:~:508$ cd path-examples
[cs15lwi23acp@ieng6-201]:path-examples:509$ ls
all-java.sh  quiz-layout
[cs15lwi23acp@ieng6-201]:path-examples:510$ cd quiz-layout
[cs15lwi23acp@ieng6-201]:quiz-layout:511$ ls
classes  general-notes
[cs15lwi23acp@ieng6-201]:quiz-layout:512$ cd ..
[cs15lwi23acp@ieng6-201]:path-examples:513$ rm -r -f quiz-layout
[cs15lwi23acp@ieng6-201]:path-examples:514$ ls
all-java.sh
```
> &uarr The command `rm -r -f` removed the 2 directories inside of the quiz-layout directory.

**rm -r -f - v**

> An examples of rm -r -f -v

``` console 
[cs15lwi23acp@ieng6-201]:~:518$ ls
path-examples  perl5  skill-demo1-server  wavelet
[cs15lwi23acp@ieng6-201]:~:519$ rm -v -r -f wavelet 
removed 'wavelet/.git/objects/pack/pack-ecec9905ba195f2ab52bb1ac32cd068b497d9999.pack'
removed directory: 'wavelet/.git/objects/pack'
removed directory: 'wavelet/.git/objects'
removed directory: 'wavelet/.git'
removed directory: 'wavelet'
```
> &uarr; The command of `rm -r -f` is used in the same way as listed above, but now with the addition of `-v` the terminal 
tells the user what exactly is being removed. This can be usuful by telling the user what is being removed, allowing them 
to catch any unwanted deleted files.

```console
[cs15lwi23acp@ieng6-201]:~:524$ rm -r -f -v perl5
removed directory: 'perl5'
```
> &uarr; The command `rm -r -f -v` told the user what is being deleted, but in this case since it was an empty directory, the 
message was just the removal of the empty directory perl5

**rm -r -f -I**

>An example of rm -r -f -I

``` console 
[cs15lwi23acp@ieng6-201]:~:527$ ls
path-examples  skill-demo1-server
[cs15lwi23acp@ieng6-201]:~:528$ rm -r -f -I path-examples
rm: remove 1 argument recursively? y
rm: remove write-protected regular file 'path-examples/.git/objects/pack/pack-a98a6300614eec431298fd6769ceb9c56831aea0.pack'? y
rm: remove write-protected regular file 'path-examples/.git/objects/pack/pack-a98a6300614eec431298fd6769ceb9c56831aea0.idx'? y
[cs15lwi23acp@ieng6-201]:~:530$ ls
skill-demo1-server
```
> &uarr; The command of `rm -r -f` is used in the same way as listed above, but now with the addition of `-I` the terminal 
prompts the user if they want to recursively remove the iteams inside of the given directory. This allows the user to catch 
any unwanted deletions or if they just want to delete certain sub-directories.

```console 
[cs15lwi23acp@ieng6-201]:~:531$ ls
skill-demo1-server
[cs15lwi23acp@ieng6-201]:~:531$ rm -r -f -I skill-demo1-server
rm: remove 1 argument recursively? y
rm: remove write-protected regular file 'skill-demo1-server/.git/objects/pack/pack-cd15105c095bef3eabe7ab46217abba163043e6c.pack'? y
rm: remove write-protected regular file 'skill-demo1-server/.git/objects/pack/pack-cd15105c095bef3eabe7ab46217abba163043e6c.idx'? y
rm: remove write-protected regular file 'skill-demo1-server/skill-demo1-data/.git/objects/pack/pack-b98cb6a4ca64cc7b2944f0fa07d3e03927d66064.pack'? y
rm: remove write-protected regular file 'skill-demo1-server/skill-demo1-data/.git/objects/pack/pack-b98cb6a4ca64cc7b2944f0fa07d3e03927d66064.idx'? y
[cs15lwi23acp@ieng6-201]:~:532$ ls
[cs15lwi23acp@ieng6-201]:~:533$ 
```
> 
