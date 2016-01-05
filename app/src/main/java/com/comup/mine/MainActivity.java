package com.comup.mine;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import java.util.Date;
import java.util.Random;


public class MainActivity extends Activity implements View.OnLongClickListener {

    private Block[][] map = null;
    private int flag = 0;
    private Date startDate = null;
    private Date endDate = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.map = null;
        this.flag = 0;
        this.startDate = null;
        this.endDate = null;

        map = new Block[9][9];

        map[0][0] = (Block) findViewById(R.id.bt11);
        map[0][1] = (Block) findViewById(R.id.bt12);
        map[0][2] = (Block) findViewById(R.id.bt13);
        map[0][3] = (Block) findViewById(R.id.bt14);
        map[0][4] = (Block) findViewById(R.id.bt15);
        map[0][5] = (Block) findViewById(R.id.bt16);
        map[0][6] = (Block) findViewById(R.id.bt17);
        map[0][7] = (Block) findViewById(R.id.bt18);
        map[0][8] = (Block) findViewById(R.id.bt19);
        map[1][0] = (Block) findViewById(R.id.bt21);
        map[1][1] = (Block) findViewById(R.id.bt22);
        map[1][2] = (Block) findViewById(R.id.bt23);
        map[1][3] = (Block) findViewById(R.id.bt24);
        map[1][4] = (Block) findViewById(R.id.bt25);
        map[1][5] = (Block) findViewById(R.id.bt26);
        map[1][6] = (Block) findViewById(R.id.bt27);
        map[1][7] = (Block) findViewById(R.id.bt28);
        map[1][8] = (Block) findViewById(R.id.bt29);
        map[2][0] = (Block) findViewById(R.id.bt31);
        map[2][1] = (Block) findViewById(R.id.bt32);
        map[2][2] = (Block) findViewById(R.id.bt33);
        map[2][3] = (Block) findViewById(R.id.bt34);
        map[2][4] = (Block) findViewById(R.id.bt35);
        map[2][5] = (Block) findViewById(R.id.bt36);
        map[2][6] = (Block) findViewById(R.id.bt37);
        map[2][7] = (Block) findViewById(R.id.bt38);
        map[2][8] = (Block) findViewById(R.id.bt39);
        map[3][0] = (Block) findViewById(R.id.bt41);
        map[3][1] = (Block) findViewById(R.id.bt42);
        map[3][2] = (Block) findViewById(R.id.bt43);
        map[3][3] = (Block) findViewById(R.id.bt44);
        map[3][4] = (Block) findViewById(R.id.bt45);
        map[3][5] = (Block) findViewById(R.id.bt46);
        map[3][6] = (Block) findViewById(R.id.bt47);
        map[3][7] = (Block) findViewById(R.id.bt48);
        map[3][8] = (Block) findViewById(R.id.bt49);
        map[4][0] = (Block) findViewById(R.id.bt51);
        map[4][1] = (Block) findViewById(R.id.bt52);
        map[4][2] = (Block) findViewById(R.id.bt53);
        map[4][3] = (Block) findViewById(R.id.bt54);
        map[4][4] = (Block) findViewById(R.id.bt55);
        map[4][5] = (Block) findViewById(R.id.bt56);
        map[4][6] = (Block) findViewById(R.id.bt57);
        map[4][7] = (Block) findViewById(R.id.bt58);
        map[4][8] = (Block) findViewById(R.id.bt59);
        map[5][0] = (Block) findViewById(R.id.bt61);
        map[5][1] = (Block) findViewById(R.id.bt62);
        map[5][2] = (Block) findViewById(R.id.bt63);
        map[5][3] = (Block) findViewById(R.id.bt64);
        map[5][4] = (Block) findViewById(R.id.bt65);
        map[5][5] = (Block) findViewById(R.id.bt66);
        map[5][6] = (Block) findViewById(R.id.bt67);
        map[5][7] = (Block) findViewById(R.id.bt68);
        map[5][8] = (Block) findViewById(R.id.bt69);
        map[6][0] = (Block) findViewById(R.id.bt71);
        map[6][1] = (Block) findViewById(R.id.bt72);
        map[6][2] = (Block) findViewById(R.id.bt73);
        map[6][3] = (Block) findViewById(R.id.bt74);
        map[6][4] = (Block) findViewById(R.id.bt75);
        map[6][5] = (Block) findViewById(R.id.bt76);
        map[6][6] = (Block) findViewById(R.id.bt77);
        map[6][7] = (Block) findViewById(R.id.bt78);
        map[6][8] = (Block) findViewById(R.id.bt79);
        map[7][0] = (Block) findViewById(R.id.bt81);
        map[7][1] = (Block) findViewById(R.id.bt82);
        map[7][2] = (Block) findViewById(R.id.bt83);
        map[7][3] = (Block) findViewById(R.id.bt84);
        map[7][4] = (Block) findViewById(R.id.bt85);
        map[7][5] = (Block) findViewById(R.id.bt86);
        map[7][6] = (Block) findViewById(R.id.bt87);
        map[7][7] = (Block) findViewById(R.id.bt88);
        map[7][8] = (Block) findViewById(R.id.bt89);
        map[8][0] = (Block) findViewById(R.id.bt91);
        map[8][1] = (Block) findViewById(R.id.bt92);
        map[8][2] = (Block) findViewById(R.id.bt93);
        map[8][3] = (Block) findViewById(R.id.bt94);
        map[8][4] = (Block) findViewById(R.id.bt95);
        map[8][5] = (Block) findViewById(R.id.bt96);
        map[8][6] = (Block) findViewById(R.id.bt97);
        map[8][7] = (Block) findViewById(R.id.bt98);
        map[8][8] = (Block) findViewById(R.id.bt99);

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                map[i][j].setOnLongClickListener(this);

        Random rd = new Random();
        int x;
        int y;
        int count = 0;

        while (true) {
            x = rd.nextInt(8) + 1;
            y = rd.nextInt(8) + 1;
            if (map[x][y].getValue() == 0) {
                map[x][y].setValue(-1);
                count++;
            }
            if (count >= 10)
                break;
        }

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                map[i][j].setValue(this.getAroundMine(i, j));
    }

    public void reStart(View v)
    {
        this.recreate();
    }

    public void exitGame(View v)
    {
        System.exit(0);
    }

    public void blockClick(View v) {

        if (startDate == null)
            startDate = new Date(System.currentTimeMillis());


        int x = ((Block) v).getIndexOfX();
        int y = ((Block) v).getIndexOfY();
        if (this.map[x][y].isEnAble()) {
            String around = Integer.toString(this.getAroundMine(x, y));
            ((Block) v).setText(around);
            ((Block) v).setEnAble(false);
            if (Integer.valueOf(around) == 0)
                this.extend(x, y);
            if (Integer.valueOf(around) == -1) {
                reStart();

            }
        }

    }

    private void reStart() {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("踩地雷啦！重新开始？");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.recreate();
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create().show();
    }

    private int getAroundMine(int x, int y) {
        int count = 0;
        if (this.map[x][y].getValue() == -1)
            return -1;
        if ((x + 1) < 9)
            if (this.map[x + 1][y].getValue() == -1)
                count++;
        if ((x + 1) < 9)
            if ((y - 1) > 0)
                if (this.map[x + 1][y - 1].getValue() == -1)
                    count++;
        if ((y - 1) > 0)
            if (this.map[x][y - 1].getValue() == -1)
                count++;
        if (x - 1 > 0)
            if (y - 1 > 0)
                if (this.map[x - 1][y - 1].getValue() == -1)
                    count++;
        if (x - 1 > 0)
            if (this.map[x - 1][y].getValue() == -1)
                count++;
        if (x - 1 > 0)
            if (y + 1 < 9)
                if (this.map[x - 1][y + 1].getValue() == -1)
                    count++;
        if (y + 1 < 9)
            if (this.map[x][y + 1].getValue() == -1)
                count++;
        if (x + 1 < 9)
            if (y + 1 < 9)
                if (this.map[x + 1][y + 1].getValue() == -1)
                    count++;
        return count;
    }

    private void click(int x, int y) {
        int value = this.map[x][y].getValue();
        if (value == -1)
            return;
        else if (value == 0) {
            this.map[x][y].setText("0");
            this.map[x][y].setEnAble(false);
            this.extend(x, y);
        } else {
            this.map[x][y].setText(Integer.toString(value));
            this.map[x][y].setEnAble(false);
        }

    }

    private void extend(int x, int y) {
        if ((x + 1) < 9)
            if (this.map[x + 1][y].getValue() != -1 && this.map[x + 1][y].isEnAble())
                click(x + 1, y);
        if ((x + 1) < 9)
            if ((y - 1) >= 0)
                if (this.map[x + 1][y - 1].getValue() != -1 && this.map[x + 1][y - 1].isEnAble())
                    click(x + 1, y - 1);
        if ((y - 1) >= 0)
            if (this.map[x][y - 1].getValue() != -1 && this.map[x][y - 1].isEnAble())
                click(x, y - 1);
        if (x - 1 >= 0)
            if (y - 1 >= 0)
                if (this.map[x - 1][y - 1].getValue() != -1 && this.map[x - 1][y - 1].isEnAble())
                    click(x - 1, y - 1);
        if (x - 1 >= 0)
            if (this.map[x - 1][y].getValue() != -1 && this.map[x - 1][y].isEnAble())
                click(x - 1, y);
        if (x - 1 >= 0)
            if (y + 1 < 9)
                if (this.map[x - 1][y + 1].getValue() != -1 && this.map[x - 1][y + 1].isEnAble())
                    click(x - 1, y + 1);
        if (y + 1 < 9)
            if (this.map[x][y + 1].getValue() != -1 && this.map[x][y + 1].isEnAble())
                click(x, y + 1);
        if (x + 1 < 9)
            if (y + 1 < 9)
                if (this.map[x + 1][y + 1].getValue() != -1 && this.map[x + 1][y + 1].isEnAble())
                    click(x + 1, y + 1);
    }

    @Override
    public boolean onLongClick(View v) {
        ((Block) v).setText("雷");
        if (((Block) v).getValue() == -1)
            flag++;
        if (flag == 10) {
            endDate = new Date(System.currentTimeMillis());
            long useTime = (endDate.getTime() - startDate.getTime()) / 1000;
            gameOver(useTime);
        }
        return true;
    }

    private void gameOver(long useTime) {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("你好棒，用时"+useTime+"秒");
        builder.setPositiveButton("重新开始", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.this.recreate();
            }
        });
        builder.setNegativeButton("退出游戏", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                System.exit(0);
            }
        });
        builder.create().show();
    }

}
