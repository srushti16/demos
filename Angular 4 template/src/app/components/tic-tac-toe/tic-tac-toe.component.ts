import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tic-tac-toe',
  templateUrl: './tic-tac-toe.component.html',
  styleUrls: ['./tic-tac-toe.component.css']
})
export class TicTacToeComponent implements OnInit {
  playerTurn = true; // true is for player 1, false is for player 2
  isOver = false;
  message = '';

  game = [
    ['', '', ''],
    ['', '', ''],
    ['', '', '']
  ];

  // xoxooxxxo

  constructor() { }

  ngOnInit() {
    this.isGameOver();
  }

  makeMove(row: number, col: number) {
    if (!this.isOver && this.game[row][col] === '') {
      this.game[row][col] = (this.playerTurn ? 'x' : 'o');
      if (this.isGameOver()) {
        console.log('over');
        this.message = `player ${this.playerTurn ? 'x' : 'o'} wins!`;
        this.isOver = true;
      } else {
        this.playerTurn = !this.playerTurn;
        console.log('not over next players turn');
      }
    }
  }

  isGameOver(): boolean  {
    // check rows kinda alright solution
    const isOver = this.game.some((row) => {
      const joined = row.join('');
      if (joined === 'xxx' || joined === 'ooo') {
        return true;
      }
    });
    if (isOver) {
      return true;
    }

    // col check
    for (let i = 0; i < 3; i++) {
      const col = this.game[0][i] + this.game[1][i] + this.game[2][i];
      if (col === 'ooo' || col === 'xxx') {
        return true;
      }
    }

    // diaganol check
    const diag1 = this.game[0][0] + this.game[1][1] + this.game[2][2];
    if (diag1 === 'ooo' || diag1 === 'xxx') {
      return true;
    }

    const diag2 = this.game[0][2] + this.game[1][1] + this.game[2][0];
    if (diag2 === 'ooo' || diag2 === 'xxx') {
      return true;
    }

    // const strGame = this.game.reduce((acc, cur) => acc + cur.join('-'), '');
    // row check
    // strGame.match(/.{1,3}/g).some((row) => {
    //   if (row === 'xxx' || row === 'ooo') {
    //     isOver = true;
    //     return true;
    //   } else {
    //     return false;
    //   }
    // });
    // // column check
    // for (let i = 0; i < 3; i++) {
    //   const col = strGame.charAt(i) + strGame.charAt(i + 3) + strGame.charAt(i + 6);
    //   if (col === 'xxx' || col === 'ooo') {
    //     return true;
    //   }
    // }

    // return isOver;
  }

  reset() {
    this.isOver = false;
    this.game = [
      ['', '', ''],
      ['', '', ''],
      ['', '', '']
    ];
    this.message = '';
  }

}
