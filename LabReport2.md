# CSE 15L Lab Report 2

> ***StringServer code:***
 
<pre><code>import java.io.IOException; 
import java.net.URI; 
import java.util.ArrayList;

class Handler implements URLHandler {

    StringBuilder searchString = new StringBuilder();


    public String handleRequest(URI url) {

        if(url.getPath().contains("/add-message")){

        String[] temp = url.getQuery().split("=");

        if(temp[0].equals("s")){

        searchString.append(temp[1]);
        searchString.append("\n");

        }

        return searchString.toString();
        }
            return "404 Not Found!";
        }
    }

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        newServer.start(port, new Handler());
    }
} </code></pre>


> ***Working example:***

![](LabReport2Example2.png)

- Method used: 
  - handleRequest: This method is used to look for the give url from the localhost
  - newServer: This method creates a new local server using the inputted port number 
- Valid arguments:
  - handelRequest: The use of string as an argument is valid for this method 
  - newServer: The use of intergers as an arguemtn is valid for this method 
- Change values: 
  - handelRequest: The value changed by parsing a "\n" to the input 
  - newServer: The value isn't changed and the int is used for the port numnber

![](LabReport2Eample1.png)
 
- Method used: 
  - handleRequest: This method is used to look for the give url from the localhost
  - newServer: This method creates a new local server using the inputted port number 
- Valid arguments:
  - handelRequest: The use of string and characters as an argument is valid for this method 
  - newServer: The use of intergers as an arguemtn is valid for this method 
- Change values: 
  - handelRequest: The value changed by parsing a `"\n"` to the input 
  - newServer: The value isn't changed and the int is used for the port numnber

> ***Bugs in code:***

__Note__: Input that causea symptoms &darr;

<pre><code>import static org.junit.Assert.*;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {

    int[] input2 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{4,3,2,1}, input2);
    

	}


  @Test
  public void testReversed() {

    int[] input2 = {1,2,3,4,5,6,7,8,9,10};
    assertArrayEquals(new int[]{10,9,8,7,6,5,4,3,2,1}, ArrayExamples.reversed(input2));
    assertNotEquals(input2,ArrayExamples.reversed(input2));

  }

@Test 
public void testAverageWithoutLowest(){

double[] input1 = {5,2,10,2,2};
assertEquals(7.5, ArrayExamples.averageWithoutLowest(input1), 0.000001);

}

}</code></pre>



__Note__: Input that doesn't cause symptoms &darr;

<pre><code>import static org.junit.Assert.*;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

  }

@Test 
public void testAverageWithoutLowest(){

double[] input1 = {5,10,2};
assertEquals(7.5, ArrayExamples.averageWithoutLowest(input1), 0.000001);

}

}</code></pre>




 



