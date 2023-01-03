using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab11_SWE4202
{
    public partial class TicTacToe : Form
    {
        Player FirstPlayer = new Player();
        Player SecondPlayer = new Player();
        Board board = new Board();
        bool player;
        public TicTacToe()
        {
            InitializeComponent();
            board.setPlayers(FirstPlayer, SecondPlayer);
            player = true;
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            board.reset();
            //2,,5,10
            //4,6,9
            //3,7,8
            button2.Text = "";
            button3.Text = "";
            button4.Text = "";
            button5.Text = "";
            button6.Text = "";
            button7.Text = "";
            button8.Text = "";
            button9.Text = "";
            button10.Text = "";
        }

        public void Reset()
        {
            board.reset();
            //2,,5,10
            //4,6,9
            //3,7,8
            button2.Text = "";
            button3.Text = "";
            button4.Text = "";
            button5.Text = "";
            button6.Text = "";
            button7.Text = "";
            button8.Text = "";
            button9.Text = "";
            button10.Text = "";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (button2.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(0, 0, false);
                player = true;
                button2.Text = "X";
            }
            else
            {
                board.makeMove(0, 0, true);
                player = false;
                button2.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }
        }

        private void button5_Click(object sender, EventArgs e)
        {
            if (button5.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(0, 1, false);
                player = true;
                button5.Text = "X";
            }
            else
            {
                board.makeMove(0, 1, true);
                player = false;
                button5.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }

        }

        private void button10_Click(object sender, EventArgs e)
        {
            if (button10.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(0, 2, false);
                player = true;
                button10.Text = "X";
            }
            else
            {
                board.makeMove(0, 2, true);
                player = false;
                button10.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }

        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (button4.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(1, 0, false);
                player = true;
                button4.Text = "X";
            }
            else
            {
                board.makeMove(1, 0, true);
                player = false;
                button4.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (button6.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(1, 1, false);
                player = true;
                button6.Text = "X";
            }
            else
            {
                board.makeMove(1, 1, true);
                player = false;
                button6.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }

        }

        private void button9_Click(object sender, EventArgs e)
        {
            if (button9.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(1, 2, false);
                player = true;
                button9.Text = "X";
            }
            else
            {
                board.makeMove(1, 2, true);
                player = false;
                button9.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (button3.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(2, 0, false);
                player = true;
                button3.Text = "X";
            }
            else
            {
                board.makeMove(2, 0, true);
                player = false;
                button3.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }

        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (button7.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(2, 1, false);
                player = true;
                button7.Text = "X";
            }
            else
            {
                board.makeMove(2, 1, true);
                player = false;
                button7.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }

        }

        private void button8_Click(object sender, EventArgs e)
        {
            if (button8.Text != "")
            {
                MessageBox.Show("Move Already Placed");
                return;
            }
            if (!player)
            {
                board.makeMove(2, 2, false);
                player = true;
                button8.Text = "X";
            }
            else
            {
                board.makeMove(2, 2, true);
                player = false;
                button8.Text = "O";
            }
            if (board.checkWinCondition())
            {
                Reset();
                if (player)
                {
                    MessageBox.Show("Player 1 Wins");
                    this.FirstPlayer.Score++;
                    player1.Text = "Player 1: " + Convert.ToString(this.FirstPlayer.Score);
                }
                else
                {
                    MessageBox.Show("Player 2 Wins");
                    this.SecondPlayer.Score++;
                    player2.Text = "Player 2: " + Convert.ToString(this.SecondPlayer.Score);
                }
            }
            if (board.isDraw())
            {
                Reset();
                MessageBox.Show("Its a Draw");
            }

        }

        private void player1_Click(object sender, EventArgs e)
        {

        }
    }
}
