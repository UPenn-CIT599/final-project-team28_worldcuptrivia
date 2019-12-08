# Final Project - Team28 - World Cup Trivia

###  Our team
Harun Buljina

Pierre Philippe Mourier

## World Cup Trivia on Alexa
#### CIT 591, Fall '19

### Project idea
We uses the skills and concepts learnt in CIT 591 to build a World Cup soccer trivia skill on Amazon Alexa-enabled devices. We started from a basic Amazon tutorial skill ([airplane facts](https://github.com/alexa/skill-sample-java-fact)) and extended its functionalities to read a cloud-hosted external CSV file and compute the facts to generate the trivia, inspired by the Data Science with Airlines assignment.

### Work breakdown (+ who did what)
1. AWS account set up (Pierre) :heavy_check_mark:
- Created AWS Account
- Created Lambda function
- Created Amazon Developer (Alexa)
2. Replicate basic functionalities of airplane facts tutorial (Pierre) :heavy_check_mark:
- Download [airplane facts tutorial repo](https://github.com/alexa/skill-sample-java-fact) locally
- Set up the Lambda function
- Build and deploy the Alexa Skill
- Make a small change to the Skill (get Alexa to give "Harun & Pierre" instead of one of the airplane facts).
See https://cit591-public.s3.amazonaws.com/alexa-tutorial.png

3. Planning/CRC cards for core functions (Harun + Pierre) :heavy_check_mark:
```diff 
! See our repo wiki for both Java and Alexa design details
```
4. Testing plan for core functions (Harun + Pierre) :heavy_check_mark:
5. Programming of core functions (Mostly Harun) :heavy_check_mark:
6. UA, QA, Documentation & Shipping of Skill with core functions (Mostly Pierre) :heavy_check_mark:

### How it works
This an Alexa Skill. It works the same as most skills. 

#### Launching the skill

<img src="https://cit591-public.s3.amazonaws.com/howto_launch.png" width="400">

#### Asking for a fact

<img src="https://cit591-public.s3.amazonaws.com/howto_ask1.png" width="400">

<img src="https://cit591-public.s3.amazonaws.com/howto_ask2.png" width="400">

<img src="https://cit591-public.s3.amazonaws.com/howto_display.png" width="800">

#### Error handling

<img src="https://cit591-public.s3.amazonaws.com/howto_incorrect.png" width="400">

#### Asking for help

<img src="https://cit591-public.s3.amazonaws.com/howto_help.png" width="400">

#### Saying goodbye

<img src="https://cit591-public.s3.amazonaws.com/howto_exit.png" width="591">


# Demo
[Watch our demo!](https://cit591-public.s3.amazonaws.com/Alexa+Demo+v3.webm)

<img src="https://cit591-public.s3.amazonaws.com/demo_preview1.PNG" width="400">
<img src="https://cit591-public.s3.amazonaws.com/demo_preview2.PNG" width="400">
<img src="https://cit591-public.s3.amazonaws.com/demo_preview3.PNG" width="400">


