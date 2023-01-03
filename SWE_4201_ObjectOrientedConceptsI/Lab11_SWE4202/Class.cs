using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab11_SWE4202
{
    public class Board
    {
        private Player player1;
        private Player player2;
        public int[,] position = new int[3, 3];
        public Board(Player player1, Player player2)
        {
            this.player1 = player1;
            this.player2 = player2;
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    position[i, j] = 0;
                }
            }
        }

        public Board()
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    position[i, j] = 0;
                }
            }
        }

        public void reset()
        {
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    position[i, j] = 0;
                }
            }
        }

        public void setPlayers(Player player1, Player player2)
        {
            this.player1 = player1;
            this.player2 = player2;
        }

        public bool makeMove(int i, int j, bool player)//true means player 1 and false means player 2
        {
            if (player)
            {
                if (position[i, j] == 0)
                {
                    position[i, j] = 1;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if (position[i, j] == 0)
                {
                    position[i, j] = -1;
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        public bool isDraw()
        {
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    if (position[i, j] == 0)
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        public bool checkWinCondition()
        {
            //Checking Row
            for (int i = 0; i < 3; i++)
            {
                if (position[i, 0] == position[i, 1] && position[i, 1] == position[i, 2] && position[i, 0] != 0)
                {
                    if (position[i, 0] == 1)
                    {
                        this.player1.Win = true;
                    }
                    else
                    {
                        this.player2.Win = true;
                    }
                    return true;
                }
            }
            //Checking Column
            for (int i = 0; i < 3; i++)
            {
                if (position[0, i] == position[1, i] && position[1, i] == position[2, i] && position[0, i] != 0)
                {
                    if (position[0, i] == 1)
                    {
                        this.player1.Win = true;
                    }
                    else
                    {
                        this.player2.Win = true;
                    }
                    return true;
                }
            }
            //Checking Diagonals
            if (position[0, 0] == position[1, 1] && position[1, 1] == position[2, 2] && position[0, 0] != 0)
            {
                if (position[0, 0] == 1)
                {
                    this.player1.Win = true;
                }
                else
                {
                    this.player2.Win = true;
                }
                return true;
            }
            if (position[0, 2] == position[1, 1] && position[1, 1] == position[2, 0] && position[0, 2] != 0)
            {
                if (position[0, 2] == 1)
                {
                    this.player1.Win = true;
                }
                else
                {
                    this.player2.Win = true;
                }
                return true;
            }
            return false;

        }

    }

    public class Player
    {
        private int score;
        private bool isWinner;
        public Player()
        {
            this.score = 0;
        }

        public int Score
        {
            get { return score; }
            set { score = value; }
        }
        public bool Win
        {
            get { return isWinner; }
            set { isWinner = value; }
        }
    }
}
