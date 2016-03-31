package raig.org;

import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class RandomStream implements Iterable<Integer> {



  @Override
  public Iterator<Integer> iterator() {
    final Random random = new Random(23);
    return new Iterator<Integer>() {
      @Override
      public boolean hasNext() {
        return true;
      }

      @Override
      public Integer next() {
        return random.nextInt();
      }
    };
  }

  public Stream<Integer> stream() {
    return StreamSupport.stream(this.spliterator(),false);
  }
}
