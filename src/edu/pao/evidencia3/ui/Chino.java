package edu.pao.evidencia3.ui;

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
}