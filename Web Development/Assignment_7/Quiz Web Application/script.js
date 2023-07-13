// Define your quiz questions and answers
const quizData = [
  {
    question: "What is the capital of France?",
    options: ["Paris", "London", "Berlin", "Madrid"],
    answer: "Paris"
  },
  {
    question: "Which planet is known as the Red Planet?",
    options: ["Mars", "Venus", "Jupiter", "Saturn"],
    answer: "Mars"
  },
  // Add more questions here...
];

let currentQuestion = 0;
let correctAnswers = 0;
let incorrectAnswers = 0;

const questionContainer = document.getElementById("question-container");
const submitButton = document.getElementById("submit-btn");
const leaderboardContainer = document.getElementById("leaderboard-container");
const scoreDisplay = document.getElementById("score-display");
const resultDisplay = document.getElementById("result-display");

function displayQuestion() {
  const question = quizData[currentQuestion];
  questionContainer.innerHTML = `
    <h3>${question.question}</h3>
    <ul>
      ${question.options
        .map(
          (option, index) =>
            `<li><input type="radio" name="answer" value="${option}">${option}</li>`
        )
        .join("")}
    </ul>
  `;
}

function checkAnswer() {
  const selectedOption = document.querySelector('input[name="answer"]:checked');
  if (selectedOption) {
    const userAnswer = selectedOption.value;
    const question = quizData[currentQuestion];
    if (userAnswer === question.answer) {
      correctAnswers++;
      // Display a popup indicating the answer is correct
      alert("Correct answer!");
    } else {
      incorrectAnswers++;
      // Display a popup indicating the answer is wrong
      alert("Wrong answer!");
    }
    currentQuestion++;
    if (currentQuestion < quizData.length) {
      displayQuestion();
    } else {
      showLeaderboard();
    }
  }
}

function showLeaderboard() {
  questionContainer.style.display = "none";
  submitButton.style.display = "none";
  leaderboardContainer.style.display = "block";

  scoreDisplay.innerHTML = `
    <p>Correct Answers: ${correctAnswers}</p>
    <p>Incorrect Answers: ${incorrectAnswers}</p>
  `;

  const percentage = (correctAnswers / quizData.length) * 100;
  let resultMessage = "";
  if (percentage >= 70) {
    resultMessage = "Congratulations! You passed the quiz.";
  } else {
    resultMessage = "Sorry! You did not pass the quiz.";
  }
  resultDisplay.textContent = resultMessage;
}

submitButton.addEventListener("click", checkAnswer);

// Start the quiz by displaying the first question
displayQuestion();
