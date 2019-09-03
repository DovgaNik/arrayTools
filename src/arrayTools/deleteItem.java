/**********************************************************************
*DovgaNik 2019 https://github.com/DovgaNik/arrayTools                 *
*GNU GPL v3 https://github.com/DovgaNik/arrayTools/blob/master/LICENSE*
**********************************************************************/

package arrayTools;

public class deleteItem {
    String[] removeElement(String[] arr, int index){ //Function that deletes item from array by index (returns array with deleted item)
        if (arr == null || index < 0 || index >= arr.length) { //Check if the array and the index are valid for deleting
            return arr; 
        }
        
        String[] tempArr = new String[arr.length - 1];  //Create new temporary array
        
        for (int i = 0, k = 0; i < arr.length; i++) { //Copying items to the temporary array
            if (i == index) {
                continue; 
            } 
            tempArr[k++] = arr[i]; 
        }
        
        return tempArr; //Returning temporary array
    }
    int[] removeElement(int[] arr, int index){ //Function that deletes item from array by index (returns array with deleted item)
        if (arr == null || index < 0 || index >= arr.length) { //Check if the array and the index are valid for deleting
            return arr; 
        }
        
        int[] tempArr = new int[arr.length - 1];  //Create new temporary array
        
        for (int i = 0, k = 0; i < arr.length; i++) { //Copying items to the temporary array
            if (i == index) {
                continue; 
            } 
            tempArr[k++] = arr[i]; 
        }
        
        return tempArr; //Returning temporary array
    }
    float[] removeElement(float[] arr, int index){ //Function that deletes item from array by index (returns array with deleted item)
        if (arr == null || index < 0 || index >= arr.length) { //Check if the array and the index are valid for deleting
            return arr; 
        }
        
        float[] tempArr = new float[arr.length - 1];  //Create new temporary array
        
        for (int i = 0, k = 0; i < arr.length; i++) { //Copying items to the temporary array
            if (i == index) {
                continue; 
            } 
            tempArr[k++] = arr[i]; 
        }
        
        return tempArr; //Returning temporary array
    }
    char[] removeElement(char[] arr, int index){ //Function that deletes item from array by index (returns array with deleted item)
        if (arr == null || index < 0 || index >= arr.length) { //Check if the array and the index are valid for deleting
            return arr; 
        }
        
        char[] tempArr = new char[arr.length - 1];  //Create new temporary array
        
        for (int i = 0, k = 0; i < arr.length; i++) { //Copying items to the temporary array
            if (i == index) {
                continue; 
            } 
            tempArr[k++] = arr[i]; 
        }
        
        return tempArr; //Returning temporary array
    }
}
