package com.lflytek.design.commond;

/**
 * @createDate:2021/6/27
 */
public class RemoteController {
    private static final int LENGTH = 5;
    // 开按钮的命令数组
    private Commond[] onCommands;
    private Commond[] offCommands;

    // 撤销命令
    private Commond undoCommand;

    public RemoteController(){
        onCommands = new Commond[LENGTH];
        offCommands = new Commond[LENGTH];

        int count = 0;
        while(count < LENGTH){
            onCommands[count] = new NoCommand();
            offCommands[count] = new NoCommand();
            count++;
        }
    }

    // 给按钮设置命令
    public void setCommands(int index,Commond onCommand,Commond offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    // 按下开的按钮
    public void onButtonWasPushed(int no){
        onCommands[no].ecexute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }
    // 按下关的按钮
    public void offButtonWasPushed(int no){
        offCommands[no].ecexute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    // 按下撤销按钮
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
