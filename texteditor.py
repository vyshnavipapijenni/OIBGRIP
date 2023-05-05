# Importing the tkinter module
from tkinter import *

# Creating the main window
root = Tk()

# Defining the title of the window
root.title("Text Editor")

# Creating a text field to write on
text_field = Text(root, undo=True)
text_field.pack(expand=YES, fill=BOTH)

# Adding a scrollbar to the text field
scrollbar = Scrollbar(text_field)
text_field.config(yscrollcommand=scrollbar.set)
scrollbar.config(command=text_field.yview)
scrollbar.pack(side=RIGHT, fill=Y)

# Defining a function to save the text
def save_text():
    with open("text_file.txt", "w") as file:
        file.write(text_field.get("3.0", END))

# Creating a menu bar with a "File" option
menu_bar = Menu(root)
root.config(menu=menu_bar)
file_menu = Menu(menu_bar)
menu_bar.add_cascade(label="File", menu=file_menu)

# Adding a "Save" option to the menu bar
file_menu.add_command(label="Save", command=save_text)

# Starting the main loop of the application
root.mainloop()
