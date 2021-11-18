// Example of modifing an obj via Setter and Constructor
    public class GetSet3 {

        public GetSet3(String value1, String value2, String value3, String value4) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
        }

        private String value1;
        private String value2;
        private String value3;
        private String value4;


        // ... Getters and Setters



        public static void main(String[] args) {

            // Its easier to this
            GetSet3 obj;

            obj= new GetSet3("j", "a", "v", "a");

            // instead that
            // its also easy to forget or do something wrong
            // when u have a lot of attributes to set
            obj.setValue1("j");
            obj.setValue2("a");
            obj.setValue3("v");
            obj.setValue4("a");

        }
    }