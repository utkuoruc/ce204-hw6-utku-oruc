# CE204 Object Oriented Programming - HW6

In this task, I solved the given problem below

This system provides the basic services to manage bank accounts at a bank called OOBank.
OOBank has many branches, each of which has an address and branch number. A client opens
accounts at a branch. Each account is uniquely identified by an account number; it has a
balance and a credit or overdraft limit. There are many types of accounts, including: a mortgage
account (which has a property as collateral), a checking account, and a credit card account
(which has an expiry date and can have secondary cards attached to it). It is possible to have a
joint account (e.g. for a husband and wife). Each type of account has a particular interest rate, a
monthly fee and a specific set of privileges (e.g. ability to write checks, insurance for purchases
etc.). OOBank is divided into divisions and subdivisions (such as Planning, Investments and
Consumer); the branches are considered subdivisions of the Consumer Division. Each division
has a manager and a set of other employees. Each customer is assigned a particular employee
as his or her ‘personal banker’.

All the diagrams are included in this report and also in README.md file as SVG links, made with PlantUml.
Doxygen documentation and homework report included in Google Classroom
Test coverage is over %95 percent

I used proxy, facade and abstract factory patterns in this homework. Abstract factory pattern is used for the account’s creations. Instead of declaring account type everytime like

```java
CreditCardAccount account = new CreditCardAccount(parameters);
```

Now with abstract factory pattern, I do something like this;

```java
Account account = accountFactory.createAccount(String account type,less parameters);
```

That’s why and how I used abstract factory in this homework.
I implemented proxy pattern between client and it’s account. Client was able to change balance details, now clients have to use addBalance, withdrawBalance and viewBalance methods just like in real life, they can’t change balance details statically. That would be a robbery

I also used Facade Pattern because things were getting too complicated for the clients, I made a good interface for clients to interact with the system, hid details

I created Java source and tests, they are located in my private repo


Github repo: https://github.com/utkuoruc/ce204-hw6-utku-oruc


Doxygen report is included in classroom

I also used UMPLE while making this homework. 
Using UMPLE wasn't required but I used it anyways 

Umple Source Code (Java source can differ, I edited some things to implement patterns): https://cruise.umple.org/umpleonline/umple.php?model=220603h96o5h8wycre


![usecase](https://www.plantuml.com/plantuml/svg/VPFDJkim44RtVefHzwrq-z-xGAN04x1WFRKdYTLaNDaJK8LuTqWSP9CMLl5yEMSisUDz4FJIDhMggH0G1zwMbO2ndhHOnmgrE0-JXzeIomGmWEwNtpyEoAS-FdujL6SXbpN18mLRylCb23NmhW3QG1e3mUJU63XWZQof5zk09VtBYHShbV7uTetDS-p9M85ZHC1ouNo3OXqdV97ZkY9z-fjVvlpPkrThVf20HzSAeDQkPGb9NEMYEnFVODQ_Ce1i08qPZZQ0EB2Ip4rkOkWE5Xh7KjKNA8WIkBq1MXRo50Gy2lMjXssJjbCVAcuDq-dTS25NoLp53yncGx9G4SsJiRLKtM2aUZ6gLofYgSVggiTwv6nKZ9Ep6H7RKRrJ4Kl6Day6XftGy01SCLm6_8Tkn2sN4E8mctworPxOj4tz2G00)

![state](https://www.plantuml.com/plantuml/svg/VP1D2i8m48NtESMiXLwW2saLbzqew48aJ9En2Os99AcbjxT2IQq5T_FppRp7Aq947xk7OTVD3JBfUfjjePIILyxIm5ALTXSTbVJOJq1gbzHUaMXv-K9jiDP6no47yPc1laDK13KQj8901t0jM-Ffqy5xvtb58M13EUpcE-iYa7LTezW2WcnbCuSZFGdZFw5J9yJuO9QQ1kndaGxEcde--M7VJIB6J5b1LexvlW40)

![sequenced](http://www.plantuml.com/plantuml/svg/dP11JiGm34NtESK_05nW5cY6EG0xzYPnsuZ4GR6ZYjiJL3gLQ462RTx__ayvgr6rbfEpQ8dnGl8QPOI-gt56O8sZE7TDaSLm_u377ZZXwOq5v7rfOke-tpPshKp6Axq3XG2_zAt0fXlwwlNYSlw4om9G-daEkzLB25qmaNZ-jiaXseeGPIWrayKYACFlYvMjLO7mV5JV6SpHfb3f5dQK3DgyPzMX9NXITW3mFpq0-AkYuwIy4OKK0qjfu-IE3wxPBOZS_MbSr5dsF_ySULuj3or-i3xCdlj2o-a3)

![classdiagram](https://www.plantuml.com/plantuml/svg/xLbRRoCr57wclsBK9mS84gyZX7RRRgMLw4M0UAdwu6IyYT5SmeoJjYhxtt5YdvuptroKWQKiYATuldEn_Tdd-DXvqpXTkssHdonptJJ9LLMxbLwPjyjbjIrTSdVtgzxfz20qpJSWlhzFda---0fGfMFZUbiiJ9qcjdHV9_fCvxfScZJva5Tw3vpN9hFk1rjOn-3xqfdQDEv7xOJgLLMwTVvqQGHsMzkTpStAD6doawjjkVBWpSQK5zvKGETvrPWCmBFQZsMT9k7N0t78jtNr-9GcyclcPvYPt3YZPccogsnsyZ6oHImzUuJQt_q-doEDKJrC-5pN6VBAaa3flFBpkApg0nkbyVmigYetklIYfTSIpFhHiRNIDmE6UoBQXXvXmpZGDEb0--atne7VuOvcBwrWoBqg745BTTNj0-JIrOpcRfkE5Gu0PwIEcpUxmVNtWAl2Ljf3eKMR0ZpHzc0qcS-_Jqw_FUrHJ9CbOf_2wQgFX5dqBBSwRaifYx4k8QNp_3otfdG-14FZxdw_NtIMnMXNHLKQ7r1PjLtaPaODh_DWtJghzSEGufbSULAI3ZmS-bIspCmZxQY0UNbvs2at7-88USkiTICmNkI36z9NEloIGsaTEG3hvhhTuIywjrbRvxbnsjdbnwImfIssnVNG45bHFuugUgO7nylzrgQeTcPSaSA5kYZDGtTjGPU8qDVcuIMIHk87ycVmI-cJzrNOp5-Uajo7HHW9fbsqeo3WhQz3Qsf_A-PXDgbJiiOeUrTiykh968mmmcFQD_7p_GKjC2buZdKXJx2tMLQRfX78xRegJKolZBvhk_J8XTtPnbPbcb0hvdXMLMY6gPZ5hRYwqgLUcHepz-i7QfWGpK_rp1dtCWrTnqQQnCP81Bz2O8u744tci2jfJMX7ijHdpTWCTZIrVZCIfaaHMXWzR3CIgTF6jnABDPiso1MltMpAI7jY_DRKJHniQ8PgZdp0k22K8qmrSVZwkyDMnc8xl0WL0KPGEyGaYa76DfmHs3Lv6OWAx93YOjHbDph6r8-94T8zB6jS5jeDB4mJGuETQ2TMW7OI6DD7l1l4eDABnjLwwPBM-J9GWiNpGNSkLXvSqCMAIgFvKjoi6BNoQiLmmNSh1ZUTovK7AxXSxNlYonM3BzjXqRfbIOaUl6wXbgmfgFuSlsCo5N3991HkcGnVTQXuvNicrLGqh-uqiM3ZsXWdZtg22TL72-fBZbGlOsZ1z2ccSb2RULKz7ACs4QuwrACchuF2DK5jBjJWMZbsvs3cK2GvGXdpWHAUErycWuHcYZZFYYLXxc6RATXso93STLIx3spAOn9iw4GMndHAHr58ag7TU-_ijPKAmOD4-AnVcz-sde21_0dYU3e3-l-B5T085oRWDA2Hol3nv-eSU2kGXmBNFON7E4cHARuWJ3VVMJDcoggVIP650T0QY9I8mGZOmeXGr3EiLdSZ--rpgWC7He5am50cp1I7DS5qMgaQ0kkOIXLJAPf29jKj7YPrZSNkzFw33roAyVjNS3Vu4ZhubjwkdStZnjP6PjNMq_b_yoZOtoGxyuwL9WiKAdKB9QaDgP4vRESanaL6Oh2TZW3lv2BHYUQsx8IyYPTO5avvZMKhUC-P_ZSB4e6EHkQ2UMQ2qKY6OUqGgB3zEMPPqlfNelbBVbgRXS9-h2X1j_2iXA5FU2nDw5FzInzAFkNRBqpsdt-9eSKPFU0c6iBn14yiTBp0fWbeF2HAGRJ_r95eHZP0TCY2mSUqTO9ix4rXeV7Q5hqfT8jweW_LxH0pU-WPSZhrXR1qBKMZDqCaFA2Hy2x3uT6eGt6muidZSOYaJg9Ckb3e42n6209788ivhBTmxzRilTNwQ9skDFu7Dvvti2zAEsFkC2KSftl4PJGGXoKZLwlD51jFDiyCpmpE8LHV1Z_j3YxrqbNrm3_Y98tdJ1pYUMsqCxMAdpy_RKGkME9_gMBjYOyhRKliS8_5RdWHFQPqlMh8_TuRKVl6bDcsoFy0)

classdiagram: https://www.plantuml.com/plantuml/uml/xLbRRoCr57wclsBK9mS84gyZX7RRRgMLw4M0UAdwu6IyYT5SmeoJjYhxtt5YdvuptroKWQKiYATuldEn_Tdd-DXvqpXTkssHdonptJJ9LLMxbLwPjyjbjIrTSdVtgzxfz20qpJSWlhzFda---0fGfMFZUbiiJ9qcjdHV9_fCvxfScZJva5Tw3vpN9hFk1rjOn-3xqfdQDEv7xOJgLLMwTVvqQGHsMzkTpStAD6doawjjkVBWpSQK5zvKGETvrPWCmBFQZsMT9k7N0t78jtNr-9GcyclcPvYPt3YZPccogsnsyZ6oHImzUuJQt_q-doEDKJrC-5pN6VBAaa3flFBpkApg0nkbyVmigYetklIYfTSIpFhHiRNIDmE6UoBQXXvXmpZGDEb0--atne7VuOvcBwrWoBqg745BTTNj0-JIrOpcRfkE5Gu0PwIEcpUxmVNtWAl2Ljf3eKMR0ZpHzc0qcS-_Jqw_FUrHJ9CbOf_2wQgFX5dqBBSwRaifYx4k8QNp_3otfdG-14FZxdw_NtIMnMXNHLKQ7r1PjLtaPaODh_DWtJghzSEGufbSULAI3ZmS-bIspCmZxQY0UNbvs2at7-88USkiTICmNkI36z9NEloIGsaTEG3hvhhTuIywjrbRvxbnsjdbnwImfIssnVNG45bHFuugUgO7nylzrgQeTcPSaSA5kYZDGtTjGPU8qDVcuIMIHk87ycVmI-cJzrNOp5-Uajo7HHW9fbsqeo3WhQz3Qsf_A-PXDgbJiiOeUrTiykh968mmmcFQD_7p_GKjC2buZdKXJx2tMLQRfX78xRegJKolZBvhk_J8XTtPnbPbcb0hvdXMLMY6gPZ5hRYwqgLUcHepz-i7QfWGpK_rp1dtCWrTnqQQnCP81Bz2O8u744tci2jfJMX7ijHdpTWCTZIrVZCIfaaHMXWzR3CIgTF6jnABDPiso1MltMpAI7jY_DRKJHniQ8PgZdp0k22K8qmrSVZwkyDMnc8xl0WL0KPGEyGaYa76DfmHs3Lv6OWAx93YOjHbDph6r8-94T8zB6jS5jeDB4mJGuETQ2TMW7OI6DD7l1l4eDABnjLwwPBM-J9GWiNpGNSkLXvSqCMAIgFvKjoi6BNoQiLmmNSh1ZUTovK7AxXSxNlYonM3BzjXqRfbIOaUl6wXbgmfgFuSlsCo5N3991HkcGnVTQXuvNicrLGqh-uqiM3ZsXWdZtg22TL72-fBZbGlOsZ1z2ccSb2RULKz7ACs4QuwrACchuF2DK5jBjJWMZbsvs3cK2GvGXdpWHAUErycWuHcYZZFYYLXxc6RATXso93STLIx3spAOn9iw4GMndHAHr58ag7TU-_ijPKAmOD4-AnVcz-sde21_0dYU3e3-l-B5T085oRWDA2Hol3nv-eSU2kGXmBNFON7E4cHARuWJ3VVMJDcoggVIP650T0QY9I8mGZOmeXGr3EiLdSZ--rpgWC7He5am50cp1I7DS5qMgaQ0kkOIXLJAPf29jKj7YPrZSNkzFw33roAyVjNS3Vu4ZhubjwkdStZnjP6PjNMq_b_yoZOtoGxyuwL9WiKAdKB9QaDgP4vRESanaL6Oh2TZW3lv2BHYUQsx8IyYPTO5avvZMKhUC-P_ZSB4e6EHkQ2UMQ2qKY6OUqGgB3zEMPPqlfNelbBVbgRXS9-h2X1j_2iXA5FU2nDw5FzInzAFkNRBqpsdt-9eSKPFU0c6iBn14yiTBp0fWbeF2HAGRJ_r95eHZP0TCY2mSUqTO9ix4rXeV7Q5hqfT8jweW_LxH0pU-WPSZhrXR1qBKMZDqCaFA2Hy2x3uT6eGt6muidZSOYaJg9Ckb3e42n6209788ivhBTmxzRilTNwQ9skDFu7Dvvti2zAEsFkC2KSftl4PJGGXoKZLwlD51jFDiyCpmpE8LHV1Z_j3YxrqbNrm3_Y98tdJ1pYUMsqCxMAdpy_RKGkME9_gMBjYOyhRKliS8_5RdWHFQPqlMh8_TuRKVl6bDcsoFy0

usecasediagram: https://www.plantuml.com/plantuml/uml/VPFDJkim44RtVefHzwrq-z-xGAN04x1WFRKdYTLaNDaJK8LuTqWSP9CMLl5yEMSisUDz4FJIDhMggH0G1zwMbO2ndhHOnmgrE0-JXzeIomGmWEwNtpyEoAS-FdujL6SXbpN18mLRylCb23NmhW3QG1e3mUJU63XWZQof5zk09VtBYHShbV7uTetDS-p9M85ZHC1ouNo3OXqdV97ZkY9z-fjVvlpPkrThVf20HzSAeDQkPGb9NEMYEnFVODQ_Ce1i08qPZZQ0EB2Ip4rkOkWE5Xh7KjKNA8WIkBq1MXRo50Gy2lMjXssJjbCVAcuDq-dTS25NoLp53yncGx9G4SsJiRLKtM2aUZ6gLofYgSVggiTwv6nKZ9Ep6H7RKRrJ4Kl6Day6XftGy01SCLm6_8Tkn2sN4E8mctworPxOj4tz2G00

statediagram: https://www.plantuml.com/plantuml/uml/VP3FYeCm4CRlynHpNl05F2owonwzxCBsK4eOawa9fab9OiMthmM9jK9ly-StytryLKmKqd2n0CUF4nRAZwxun5efqNZ74-GgxmucQHLeN81jcwblpR8NzOsCfTPOawOIvME6ven9CxPaoKb64z7tiCVpfvyGV10DnqWTb_YrtZcVa9qVEWqR28kTpH9_-SgKtWdz3LBE3rQfPG0lYtpmRtWKYnzuRZ8nPmfGiLDpmdS0

sequencediagram: http://www.plantuml.com/plantuml/uml/dP11JiGm34NtESK_05nW5cY6EG0xzYPnsuZ4GR6ZYjiJL3gLQ462RTx__ayvgr6rbfEpQ8dnGl8QPOI-gt56O8sZE7TDaSLm_u377ZZXwOq5v7rfOke-tpPshKp6Axq3XG2_zAt0fXlwwlNYSlw4om9G-daEkzLB25qmaNZ-jiaXseeGPIWrayKYACFlYvMjLO7mV5JV6SpHfb3f5dQK3DgyPzMX9NXITW3mFpq0-AkYuwIy4OKK0qjfu-IE3wxPBOZS_MbSr5dsF_ySULuj3or-i3xCdlj2o-a3