class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int student1 = 0, student0 = 0;
        for (int student: students) {
            if (student == 1) {
                ++student1;
            } else {
                ++student0;
            }
        }
        for (int i = 0; i < sandwiches.length; ++i) {
            if (sandwiches[i] == 1 && student1 == 0) {
                return student0;
            } else if (sandwiches[i] == 0 && student0 == 0){
                return student1;
            }
            if (sandwiches[i] == 1) {
                --student1;
            } else {
                --student0;
            }            
        }
        return 0;
    }
}
