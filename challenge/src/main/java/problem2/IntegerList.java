package problem2;

public class IntegerList {
  int[] list; // values in the list
  int pointer;

  // -------------------------------------------------------
  // create a list of the given size
  // -------------------------------------------------------
  public IntegerList(int size) {
    list = new int[size];
    this.pointer = 0;
  }

  // -------------------------------------------------------
  // Increase size of the array
  // -------------------------------------------------------

  public void increaseSize() {
    int[] new_list = new int[2 * list.length];
    this.list = new_list;
  }

  // -------------------------------------------------------
  // Add an element to the array
  // -------------------------------------------------------
  public void addElement(int val) {
    if (this.pointer == list.length) {
      this.increaseSize();
    }
    list[this.pointer] = val;
    this.pointer++;
  }

  // -------------------------------------------------------
  // RemoveFirst method
  // -------------------------------------------------------
  public void RemoveFirst(int val) {
    int index = -1;
    for (int i = 0; i < this.pointer; i++) {
      if (this.list[i] == val) {
        index = i;
        break;
      }
    }

    if (index == -1) {
      return;
    }

    for (int k = index; k < this.pointer - 1; k++) {
      this.list[k] = this.list[k + 1];
    }
    this.pointer--;
  }

  // -------------------------------------------------------
  // fill array with integers between 1 and 100, inclusive
  // -------------------------------------------------------
  public void RemoveAll(int val) {
    int numOfOccurrence = 0;
    for (int i = 0; i < this.pointer; i++) {
      if (this.list[i] == val) {
        numOfOccurrence++;
      }
    }

    for (int i = 0; i < numOfOccurrence; i++) {
      this.RemoveFirst(val);
    }
  }

  // -------------------------------------------------------
  // fill array with integers between 1 and 100, inclusive
  // -------------------------------------------------------
  public void randomize() {
    for (int i = 0; i < list.length; i++) list[i] = (int) (Math.random() * 100) + 1;
  }

  // -------------------------------------------------------
  // print array elements with indices
  // -------------------------------------------------------
  public void print() {
    for (int i = 0; i < this.pointer; i++) System.out.println(i + ":\t" + list[i]);
  }
}
