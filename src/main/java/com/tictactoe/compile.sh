#!/bin/bash
echo "🔨 Compiling Tic-Tac-Toe..."
javac -d bin src/main/java/com/tictactoe/*.java
if [ $? -eq 0 ]; then
    echo "✅ Compilation complete!"
else
    echo "❌ Compilation failed!"
fi
