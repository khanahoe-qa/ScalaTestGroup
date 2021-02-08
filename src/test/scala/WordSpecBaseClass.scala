import org.scalatest.matchers.should.Matchers
import org.scalatest.{BeforeAndAfter, Inside, Inspectors, OptionValues}
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.mockito.MockitoSugar


abstract class WordSpecBaseClass extends AnyWordSpec with Matchers
  with OptionValues with Inside with Inspectors with MockitoSugar with BeforeAndAfter


