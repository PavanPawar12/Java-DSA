package Stacks;

public class DynamicStack extends CustomStacks{

    public DynamicStack() {
        super(); // it will call CustomStack();
    }

    public DynamicStack(int size) {
        super(size); // it will call CustomStack();
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
            int[] temp = new int[data.length + 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
    }

}
