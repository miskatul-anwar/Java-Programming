#!/bin/bash
echo "Running...." | lolcat -a
# Check if filename is provided
if [ -z "$1" ]; then
	echo "Usage: $0 filename"
	exit 1
fi

# Get the file extension
filename="$1"
extension="${filename##*.}"

# Create a temporary helper script
helper_script=$(mktemp)

# Function to generate the helper script
generate_helper_script() {
	cat <<EOL >"$helper_script"
#!/bin/bash
clear
case "$extension" in
    c)
        gcc "$filename" -o output && ./output
        ;;
    cpp|cc|cxx)
        g++ "$filename" -o output && ./output
        ;;
    py)
        python3 "$filename"
        ;;
    java)
        javac "$filename" && java "${filename%.*}"
        ;;
    *)
        echo "Unsupported file type: $extension"
        exit 1
        ;;
esac
EOL
}

# Generate the helper script
generate_helper_script

# Make the helper script executable
chmod +x "$helper_script"

# Watch the file for changes and run the helper script
echo "$filename" | entr -c "$helper_script"

# Clean up
rm -f "$helper_script"
