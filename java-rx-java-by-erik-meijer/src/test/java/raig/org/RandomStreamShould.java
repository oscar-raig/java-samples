package raig.org;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;


import org.junit.Test;
import org.mockito.Mockito;

import java.util.Iterator;


public class RandomStreamShould {

  @Test
  public void  notGenerateExceptionWhenInstiantate() {

    RandomStream integers = new RandomStream();

    assertThat(true, is(true));
  }

  @Test
  public void  generateAtLeastOneInteger() {

    RandomStream integers = new RandomStream();

    Iterator<Integer> iterator = integers.iterator();

    assertThat( iterator.hasNext(), is(true));
  }

  @Test
  public void  convertToStream() {

    RandomStream integers = new RandomStream();

    integers.stream().limit(5).forEach(System.out::println);


  }

}

