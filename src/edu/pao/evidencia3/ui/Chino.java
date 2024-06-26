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
    public String casilla_ocupada()
    {
        return "所选的盒子已被占用！请选择另一个盒子。";
    }

    @Override
    public String correcion_de_casilla() {
        return "请输入行和列的整数！";
    }

    @Override
    public String empate() {
        return "比赛以平局结束。";
    }

    @Override
    public String felicitacion() {
        return "恭喜！";
    }

    @Override
    public String ganador() {
        return "获胜者是：";
    }

    @Override
    public String ganador_jugador1() {
        return "玩家1赢了";
    }

    @Override
    public String ganador_jugador2() {
        return "玩家2赢了";
    }

    @Override
    public String ganador_jugadorsolo() {
        return "玩家赢了";
    }

    @Override
    public String ganador_cpu() {
        return "CPU赢了";
    }

    @Override
    public String tipo_juego() {
        return "选择游戏类型：";
    }

    @Override
    public String un_jugador() {
        return "一名玩家对CPU";
    }

    @Override
    public String dos_jugadores() {
        return "两名玩家";
    }

    @Override
    public String menu_dificultad() {
        return "选择CPU难度：";
    }

    @Override
    public String facil() {
        return "简单";
    }

    @Override
    public String intermedia() {
        return "中等";
    }

    @Override
    public String dificil() {
        return "困难";
    }

    @Override
    public String turno_jugadorsolo() {
        return "轮到你了";
    }

    @Override
    public String turno_cpu() {
        return "轮到CPU了";
    }

    @Override
    public String elegir_simbolo_jugador1() {
        return "玩家1，请从可用符号列表中选择您的符号：";
    }

    @Override
    public String elegir_simbolo_jugador2() {
        return "玩家2，请从可用符号列表中选择您的符号：";
    }

    @Override
    public String elegir_simbolo_jugadorsolo() {
        return "玩家，请从可用符号列表中选择您的符号：";
    }

    @Override
    public String opcion_continuar() {
        return "您想要继续玩吗？（Y/N）：";
    }
    @Override
    public String sigue_intentando()
    {
        return "下次好运，继续努力";
    }
    @Override
    public String jugar()
    {
        return "玩井字游戏";
    }

    @Override
    public String mostrar_salon_fama()
    {
        return "显示名人堂";
    }
    @Override
    public String menu_inicio()
    {
        return "请输入所需选项: ";
    }
    @Override
    public String salir()
    {
        return "退出程序";
    }
    @Override
    public String titulo_salon_fama()
    {
        return "名人堂";
    }
    @Override
    public String victorias()
    {
        return "胜利: ";
    }

    @Override
    public String partidas_jugadas()
    {
        return "赢得的比赛";
    }
    @Override
    public String partidas_empatadas()
    {
        return "平局的比赛";
    }
    @Override
    public String partidas_perdidas()
    {
        return "输掉的比赛";
    }
    @Override
    public String resumen_partidas()
    {
        return "比赛总结：";
    }
    @Override
    public String partidas_ganadas()
    {
        return "赢得的比赛: ";
    }


}

