# Set the terminal to a preferred type, for example, png or svg
set terminal pngcairo enhanced size 800,600

set output 'manifold_java2.png'

# Set labels for the axes
set xlabel 'X axis'
set ylabel 'Y axis'
set zlabel 'Z axis'
# set timestamp
set timestamp "%d/%m/%y %H:%M" offset 30,2 font "Helvetica"
show timestamp
# Set the title of the plot
set title '3D Manifold Plot java x  '

# Set the view angle
set view 60,30

# Set the color palette
set palette defined (0 'blue', 1 'green', 2 'yellow', 3 'red')

# Load the data from the file and plot it
splot 'data.txt' using 1:2:3 with lines palette
