package edu.pao.evidencia3.ui;

/**
 * Esta clase es la encargada de los textos en chino.
 */
public class Chino extends Textos
{
    @Override
    public String bienvenida()
    {
        return "欢迎来到 Tic Tac Toe，选择您的游戏模式：";
    }

    @Override
    public String opcion_de_juego()
    {
        return "1. 一名玩家\n" +
                " 2. 两名玩家";
    }

    @Override
    public String opcion_invalida()
    {
        return "选项无效，请重试。";
    }

    @Override
    public String ingreso_casilla()
    {
        return "，输入您的移动的行和列（例如: 0 1):";
    }

    @Override
    public String casilla_ocupadada()
    {
        return "所选的盒子已被占用！请选择另一个盒子。";
    }

    @Override
    public String correcion_de_casilla()
    {
        return "请输入行和列的整数！";
    }

    @Override
    public String empate()
    {
        return "比赛以平局结束。";
    }

    @Override
    public String felicitacion()
    {
        return "恭喜你，你赢了！";
    }

    @Override
    public String ganador()
    {
        return "获胜者是：";
    }
}