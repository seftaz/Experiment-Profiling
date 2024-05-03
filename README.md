# Profiling

## بخش اول

ابتدا YourKit را دانلود و با اینتلیجی integrate میکنیم. حال در پروژه وقتی روی کلاس JavaCup راست کلیک کنیم گزینه Profiling ظاهر میشود:

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/412ebbb5-740c-45d7-b0ef-3dfa72b16200)

حال با اجرای این کد و وارد کردن اعداد ورودی، به Yourkit هدایت میشویم:

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/5405269a-d623-4779-aca3-acc90ee38053)

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/cdc2af0e-0759-4983-b466-e1ec13f201d7)

به ما اطلاع داده میشود که یک Snapshot به طور خودکار ضبط شده است. میتوان روی آن زد تا نمایان شود اما ما نیازی نداریم. در تصویر زیر مشخص است متد temp زمان زیادی میبرد:

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/7a40dc1e-96c3-4b49-8b6b-8f79adbb0120)

این متد را بررسی میکنیم:

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/e96e0ab5-d7f7-4791-9567-0a6e41c38e18)

مشخصا این متد اعدادی به فرم a + b که a از 0 تا 9999 و b از 0 تا 19999 هستند را در یک array list میریزد اما از آن اصلا استفاده ای نمیکند و کاملا بیهوده است. پس میتوان این متد را فقط با یک ریترن جایزگین کرد:

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/e95bf8de-083a-4a7f-9fae-06bdf9683a04)

حال دوباره با اجرای profiling برنامه را ران میکنیم:

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/25917714-c42f-4c65-a2a2-265a1b66ffa1)

این بار برنامه با موفقیت اجرا میشود. در پنجره yourkit هم داریم:

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/c2bd76ec-9457-408e-9b7f-3ce2b07868f7)

مشخصا چون برنامه فورا اجرا میشود دیگر متدی نداریم که تایم ببرد و بهینه سازی انجام شده است. این هم مثالی که جواب yes بگیریم (اعداد فیثاغورسی):

![image](https://github.com/seftaz/Experiment-Profiling/assets/79263953/3f694776-545f-48c5-af8c-730331e56bd2)


اینجا هم مجددا همان خروجی قبل را در yourkit میبینیم چون متد زمان بری نداریم.


## Second Section
we solve the coin change problem in two ways firstly using recursive and secondly using DP for better timing and using of resources.
in recursive way:
![1](https://github.com/seftaz/Experiment-Profiling/assets/79265188/f82aa090-60a3-4612-9134-b5dbed98011e)
![2](https://github.com/seftaz/Experiment-Profiling/assets/79265188/f27a1596-af82-470a-9782-234f78c2bf4b)
![3](https://github.com/seftaz/Experiment-Profiling/assets/79265188/c6a1242f-6ade-4d30-b5b5-2cb4a07fa5a3)
![4](https://github.com/seftaz/Experiment-Profiling/assets/79265188/1f9df906-b732-44d8-895d-58687919cc89)
after that resolve problem by using DP:
![5](https://github.com/seftaz/Experiment-Profiling/assets/79265188/14df8118-1103-4d62-8a4a-07ee08635ff6)
![6](https://github.com/seftaz/Experiment-Profiling/assets/79265188/5d372db8-eebb-49dd-82f7-dfe5a50c1601)
![7](https://github.com/seftaz/Experiment-Profiling/assets/79265188/ac21877d-7b4a-4139-8ffd-fbcc534b592f)
![8](https://github.com/seftaz/Experiment-Profiling/assets/79265188/17b7b306-2a5a-4c20-abdd-5f8a5e31c872)
