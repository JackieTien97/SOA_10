1. 本项目采用的SpringMVC框架搭建的webservice服务器
2. 采用start from wsdl模式，用Apache CXF Ctl 将作业7和8的wsdl文档转化为java类
3. 项目对于学生数据的持久化存储采取了简化模式，项目启动时，将所有学生的信息通过硬编码初始化的方式（将所有学生信息写死在代码里，详情请见cn.edu.nju.soa.data包），没有使用数据库。