package hw12.task1;

import hw12.task1.threads.Water;

public class Main {
        public static void main(String[] args) {
            String ss = "OOHHHHOOHHHHOOHHHH";
            Water water = new Water();

            Runnable releaseHydrogen = () -> System.out.print("H");
            Runnable releaseOxygen = () -> System.out.print("O");

            for (int i = 0; i < ss.length(); i++) {
                char ch = ss.charAt(i);
                if(ch=='O'){
                    new Thread(() ->{
                        try{
                            water.oxygen(releaseOxygen);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();
                }else if(ch=='H'){
                    new Thread(() ->{
                        try {
                            water.hydrogen(releaseHydrogen);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();
                }
            }
        }
    }

