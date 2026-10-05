catch (InterruptedException e) 
             {
e.printStackTrace();

            }
        }
    }
}

class HelloThread extends Thread 
{
public void run() 
{
while (trclass GoodMorningThread extends Thread 
{
public void run() 
           {
while (true) 
            {
System.out.println("Good Morning");
try
            {
sleep(1000); 
            } 
ue) 
{
System.out.println("Hello");
try
{
Thread.sleep(2000); 
            } 
catch (InterruptedException e) 
{
e.printStackTrace();
            }
        }
    }
}

class WelcomeThread extends Thread 
{
public void run() 
{
while (true) 
{
System.out.println("Welcome");
try
{
Thread.sleep(3000); 
            } 
catch (InterruptedException e) 
{
e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
public static void main(String[] args) 
{
        GoodMorningThread thread1 = new GoodMorningThread();
        HelloThread thread2 = new HelloThread();
        WelcomeThread thread3 = new WelcomeThread();

thread1.start();
thread2.start();
thread3.start();
    }
}
