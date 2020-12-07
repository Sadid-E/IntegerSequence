import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence{

  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    currentIndex = 0;
    int[] data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public void reset(){

  }

  public int length(){
    return 0;
  }

  public boolean hasNext(){
    return true;
  }

  public int next(){
    return 0;
  }

}
