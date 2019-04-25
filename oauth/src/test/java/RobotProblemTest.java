import static org.mockito.Mockito.mock;

import model.Matrix;
import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author evivehealth on 25/04/19.
 */
@RunWith(MockitoJUnitRunner.class)
public class RobotProblemTest {
  @InjectMocks
  private RobotProblem robotProblem;

  @BeforeClass
  private void setRobotProblem() {
    Matrix matrix = mock(Matrix.class);
  }

  @Test
  public void testMatrixFormation() {
    Assertions.assertThat(robotProblem.getFinalResult()).isEqualTo(getMatrix());
  }

  private Matrix getMatrix() {
    //return desired matrix:
    return Matrix.builder().build();
  }


}