package sodoku.userinterface;

import sodoku.problemdomain.SodokuGame;

public interface IUserIntefaceContract {
    interface EventListener{
        void onSodokuInput(int x, int y, int input);
        void onDialogClick();
    }

    interface View{
        void setListener(IUserIntefaceContract.EventListener listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SodokuGame game);
        void showDialog(String message);
        void showError(String message);
    }

}

