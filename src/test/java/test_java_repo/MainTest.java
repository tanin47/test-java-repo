package test_java_repo;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void test() {
    Assert.assertEquals(2, Main.get());
  }
}
