class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<List<Integer>> carsWithSpeed = new ArrayList<>(); 

        for(int i = 0; i < position.length; i++)
        {
            List<Integer> individualList = new ArrayList<>();
            individualList.add(position[i]);
            individualList.add(speed[i]);
            carsWithSpeed.add(individualList);
        }

        carsWithSpeed.sort((list1, list2) -> Integer.compare(list2.get(0), list1.get(0)));
        // System.out.println(carsWithSpeed);

        Stack<Double> stack = new Stack<>();
        for(List<Integer> carWithSpeed: carsWithSpeed)
        {
            stack.push((double) (target - carWithSpeed.get(0))/carWithSpeed.get(1));
            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2))
            {
                stack.pop();
            }
        }
        return stack.size();
    }
}
