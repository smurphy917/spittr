
public class TestClass {

        public static final String v1 = "A";
        private static final long LONG_VAL = Long.MAX_VALUE;
        public static final String v2 = "BOGUS";

        @SampleAnnotation(value="max",defaultValue=v2, longValue=LONG_VAL)
        public void foo() {
        }

}
