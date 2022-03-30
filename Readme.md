Task:
The manatees have been streaming many movies over the course of the last year. You have been
asked to determine the movie they think will win "Best Aquatic Feature Film."
For your convenience, the movies are numbered (1 <= N <= 50,000) and the actual titles of the
movies are not important. The manatees have voted in two rounds, and the number of votes received
for each movie is recorded. As many as 1 billion (1000,000,000) manatees worldwide may vote. The
K (1<=K<=N) movies with the most votes in the first round will advance to the second round. The
winner is the movie with the largest vote total in the second round. Ties are broken in both cases by
picking the movie with the higher index number.
Determine which movie comes in the first place and which movie comes in last place in the second
round.
Input format:
All the input comes from the standard input stream.
Line 1: Two space-separated integers: N and K
Lines 2..N+1: Line i+1 contains two space-separated integers: R1 and R2, where R1 is the votes for
round 1 and R2 is the votes for round 2.
Sample Input
5 3
3 10
9 2
5 6
8 4
6 5
In this sample, there are 5 movies, 3 of which will advance to the second round. The movies expect to
get 3, 9, 5, 8, and 6 votes, respectively, in the first round and 10, 2, 6, 4, and 5 votes, respectively, in
the second.
Output format:
The output is consists of two numbers.
Sample output
5 2
Movies 2, 4, and 5 advances to the second round. In the second round, movie 5 gets 5 votes and
gets first place and movie 2 gets 2 votes and gets last place.
Hints:
Use records to keep the index, the first -ound votes, and the second round votes together.
Sort twice using comparator. 