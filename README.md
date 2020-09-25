# KLists
Given an “outer” array of k “inner” arrays, with each inner array sorted in
ascending order. Your task is to merge and return all the inner arrays into
one sorted “output” array.

Import the necessary packages for Arrays, Maps and TrreMap.

Create class KLists
Create method public double[] mergeKLists of type double and pass the two
dimensional array outerArray of type double as parameter.

Declare totalElement variable of type integer and initialize it to 0.

Calculate the total number of elements in the array using a for loop.
Return an empty array if there is no element in the array.

Create a TreeMap which keeps track of count of different number and also
maintains the assending order on keys, in this case, array values.

Fill the countMap using an enhanced For loop and then return the output.
Create the main method public static void main(String[] args)
Create an instance of the Klists class. In this case it is named klists.
Initialize the outerArray array of type double with double values.

Use the klists class to invoke the mergeKLists method and pass the outerArray
as the parameter.

Finally print out the output array.
