# DetectorAssignment
Detect the enemy ship and torpedo

---------------- Comments for code

Not optimal code: The ArrayList<ArrayList<Boolean> > in Pattern class not the fastest to search.

Currently the double loop makes the code complexity to quadratic. I'm sure it is possible some optimization to make it much faster 
and can find ship and torpedo in a much bigger detector map too.

Organization of file could be fragmented to different folders depend on their functions with the domain of company.

It is possible create more test to check smaller parts of code (only pattern class, only locations class and so on).

Here is the result of the provided detector map and frame of torpedo and enemy ship.

Y is vertical, X is horizontal position from the file. Line zero means Y=0 and so on.


Possible torpedos
Start X:0 Start Y:0
Start X:78 Start Y:1
Start X:47 Start Y:2
Start X:88 Start Y:2
Start X:59 Start Y:3
Start X:57 Start Y:4
Start X:66 Start Y:4
Start X:13 Start Y:6
Start X:56 Start Y:6
Start X:51 Start Y:7
Start X:69 Start Y:7
Start X:69 Start Y:8
Start X:79 Start Y:8
Start X:45 Start Y:9
Start X:29 Start Y:14
Start X:69 Start Y:14
Start X:45 Start Y:17
Start X:88 Start Y:17
Start X:88 Start Y:18
Start X:0 Start Y:20
Start X:7 Start Y:20
Start X:83 Start Y:22
Start X:60 Start Y:24
Start X:74 Start Y:25
Start X:39 Start Y:26
Start X:17 Start Y:31
Start X:67 Start Y:32
Start X:85 Start Y:33
Start X:17 Start Y:34
Start X:10 Start Y:35
Start X:22 Start Y:35
Start X:53 Start Y:35
Start X:20 Start Y:36
Start X:20 Start Y:37
Start X:79 Start Y:37
Start X:67 Start Y:43
Start X:10 Start Y:45
Start X:78 Start Y:45
Start X:64 Start Y:46
Start X:19 Start Y:47
Start X:20 Start Y:47
Start X:76 Start Y:47
Start X:1 Start Y:50
Start X:50 Start Y:51
Start X:45 Start Y:52
Start X:36 Start Y:53
Start X:86 Start Y:55
Start X:12 Start Y:57
Start X:19 Start Y:57
Start X:2 Start Y:60
Start X:3 Start Y:61
Start X:6 Start Y:61
Start X:9 Start Y:61
Start X:10 Start Y:61
Start X:56 Start Y:61
Start X:8 Start Y:62
Start X:36 Start Y:62
Start X:79 Start Y:64
Start X:48 Start Y:65
Start X:88 Start Y:65
Start X:42 Start Y:66
Start X:57 Start Y:67
Start X:2 Start Y:70
Start X:6 Start Y:70
Start X:37 Start Y:71
Start X:51 Start Y:71
Start X:3 Start Y:72
Start X:57 Start Y:73
Start X:71 Start Y:73
Start X:22 Start Y:75
Start X:23 Start Y:75
Start X:68 Start Y:77
Start X:81 Start Y:77
Start X:25 Start Y:78
Start X:47 Start Y:80
Start X:67 Start Y:80
Start X:70 Start Y:80
Start X:35 Start Y:81
Start X:36 Start Y:81
Start X:61 Start Y:84
Start X:84 Start Y:85
------------------------------

Possible enemy ships
Start X:65 Start Y:0
Start X:67 Start Y:0
Start X:68 Start Y:0
Start X:57 Start Y:2
Start X:19 Start Y:3
Start X:22 Start Y:3
Start X:23 Start Y:3
Start X:73 Start Y:3
Start X:74 Start Y:3
Start X:77 Start Y:3
Start X:78 Start Y:3
Start X:30 Start Y:4
Start X:31 Start Y:4
Start X:54 Start Y:4
Start X:56 Start Y:4
Start X:57 Start Y:4
Start X:44 Start Y:5
Start X:45 Start Y:5
Start X:46 Start Y:5
Start X:65 Start Y:5
Start X:66 Start Y:5
Start X:68 Start Y:5
Start X:54 Start Y:6
Start X:32 Start Y:8
Start X:33 Start Y:8
Start X:34 Start Y:8
Start X:35 Start Y:8
Start X:36 Start Y:8
Start X:57 Start Y:8
Start X:2 Start Y:9
Start X:41 Start Y:9
Start X:44 Start Y:9
Start X:74 Start Y:9
Start X:77 Start Y:9
Start X:78 Start Y:9
Start X:79 Start Y:9
Start X:57 Start Y:10
Start X:44 Start Y:11
Start X:45 Start Y:11
Start X:46 Start Y:11
Start X:67 Start Y:11
Start X:81 Start Y:11
Start X:82 Start Y:11
Start X:41 Start Y:13
Start X:44 Start Y:13
Start X:45 Start Y:13
Start X:46 Start Y:13
Start X:66 Start Y:13
Start X:67 Start Y:13
Start X:2 Start Y:14
Start X:14 Start Y:14
Start X:65 Start Y:15
Start X:70 Start Y:15
Start X:71 Start Y:15
Start X:78 Start Y:15
Start X:79 Start Y:17
Start X:81 Start Y:17
Start X:82 Start Y:17
Start X:68 Start Y:18
Start X:69 Start Y:18
Start X:39 Start Y:19
Start X:52 Start Y:19
Start X:53 Start Y:19
Start X:54 Start Y:19
Start X:55 Start Y:19
Start X:83 Start Y:19
Start X:68 Start Y:20
Start X:57 Start Y:21
Start X:58 Start Y:21
Start X:60 Start Y:21
Start X:2 Start Y:22
Start X:3 Start Y:22
Start X:17 Start Y:22
Start X:60 Start Y:23
Start X:54 Start Y:25
Start X:55 Start Y:25
Start X:56 Start Y:25
Start X:57 Start Y:25
Start X:62 Start Y:25
Start X:63 Start Y:25
Start X:83 Start Y:25
Start X:25 Start Y:26
Start X:51 Start Y:27
Start X:59 Start Y:27
Start X:60 Start Y:27
Start X:23 Start Y:28
Start X:50 Start Y:29
Start X:23 Start Y:30
Start X:50 Start Y:31
Start X:51 Start Y:31
Start X:64 Start Y:31
Start X:64 Start Y:33
Start X:65 Start Y:33
Start X:66 Start Y:33
Start X:67 Start Y:33
Start X:33 Start Y:34
Start X:85 Start Y:34
Start X:0 Start Y:35
Start X:64 Start Y:35
Start X:35 Start Y:37
Start X:36 Start Y:37
Start X:38 Start Y:37
Start X:45 Start Y:37
Start X:47 Start Y:37
Start X:48 Start Y:37
Start X:51 Start Y:39
Start X:52 Start Y:39
Start X:64 Start Y:39
Start X:65 Start Y:39
Start X:66 Start Y:39
Start X:67 Start Y:39
Start X:79 Start Y:40
Start X:80 Start Y:40
Start X:67 Start Y:41
Start X:41 Start Y:42
Start X:44 Start Y:43
Start X:62 Start Y:44
Start X:76 Start Y:45
Start X:0 Start Y:46
Start X:25 Start Y:49
Start X:50 Start Y:49
Start X:51 Start Y:49
Start X:54 Start Y:49
Start X:57 Start Y:49
Start X:59 Start Y:49
Start X:2 Start Y:50
Start X:36 Start Y:51
Start X:10 Start Y:53
Start X:26 Start Y:53
Start X:27 Start Y:53
Start X:61 Start Y:54
Start X:25 Start Y:55
Start X:26 Start Y:55
Start X:61 Start Y:55
Start X:51 Start Y:57
Start X:13 Start Y:59
Start X:15 Start Y:59
Start X:36 Start Y:60
Start X:16 Start Y:61
Start X:17 Start Y:61
Start X:18 Start Y:61
Start X:19 Start Y:61
Start X:23 Start Y:61
Start X:42 Start Y:61
Start X:43 Start Y:61
Start X:71 Start Y:61
Start X:32 Start Y:62
Start X:52 Start Y:62
Start X:54 Start Y:62
Start X:55 Start Y:62
Start X:58 Start Y:62
Start X:66 Start Y:63
Start X:67 Start Y:63
Start X:68 Start Y:63
Start X:69 Start Y:63
Start X:15 Start Y:65
Start X:19 Start Y:65
Start X:62 Start Y:65
Start X:63 Start Y:65
Start X:66 Start Y:65
Start X:26 Start Y:66
Start X:27 Start Y:66
Start X:85 Start Y:66
Start X:33 Start Y:67
Start X:42 Start Y:67
Start X:43 Start Y:67
Start X:44 Start Y:67
Start X:45 Start Y:67
Start X:54 Start Y:67
Start X:12 Start Y:69
Start X:85 Start Y:70
Start X:57 Start Y:71
Start X:34 Start Y:72
Start X:57 Start Y:73
Start X:66 Start Y:74
Start X:57 Start Y:75
Start X:34 Start Y:76
Start X:34 Start Y:78
Start X:12 Start Y:80
Start X:45 Start Y:80
Start X:46 Start Y:80
Start X:47 Start Y:80
Start X:3 Start Y:84
Start X:9 Start Y:84
Start X:11 Start Y:84
Start X:12 Start Y:84
Start X:45 Start Y:84
Start X:46 Start Y:84
Start X:71 Start Y:85
Start X:78 Start Y:85
Start X:24 Start Y:87