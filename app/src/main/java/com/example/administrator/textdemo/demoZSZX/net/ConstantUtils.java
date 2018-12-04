package com.example.administrator.textdemo.demoZSZX.net;

/**
 * Created by wxm on 2018/12/4.
 */
public class ConstantUtils{
        public static String base_url_host = "http://47.92.136.84/api/";//测试服务器api
















         */
        public static String findUnits = base_url_host + "/findUnits";
        /**
         * 用户注册
         */
        // public static String registeruser_url = base_url_host+"/wregisterUser";
        public static String registerUser = base_url_host + "/registerUser";
        /**
         * 公司注册
         */
        public static String registerUnit = base_url_host + "/registerUnit";
        /**
         * 忘记密码
         */
        public static String forgotPassword = base_url_host+ "/forgotPassword";
        /**
         * 竞标中
         */
        public static String competitivesByCityUrl = base_url_host+ "/competitivesByCity";
        /**
         * 获取公司详情
         */
        public static String companyDetals = base_url_host + "/unit/";
        /**
         * 进行中，历史项目接口
         */
        public static String inProjectUrl = base_url_host+ "/projectGroupsByStatus";

        /**
         * 取消竞标
         */
        public static String cancelCompetitive = base_url_host+ "/cancelCompetitive/";
        /**
         * 获取竞标中的详情
         */
        public static String getCompetitiveById = base_url_host + "/competitiveById/";
        /**
         * 获取会议列表(用于手机端)--getPhoneMeetings
         */
        public static String getPhoneMeetings = base_url_host + "/phoneMeetings";
        /**
         * 获取会议详情
         */
        public static String meeting_detail_url = base_url_host + "/meeting";
        /**
         * 获取洽商(协调事宜)列表
         */
        public static String getPhoneCoordinations = base_url_host+ "/phoneCoordinations";
        /**
         * 获取洽商详情
         */
        public static String getCoordination = base_url_host+ "/coordination";
        /**
         * 风险评估列表
         */
        public static String getPhoneRMs = base_url_host + "/phoneRMs";
        /**
         * 风险评估详情
         */
        public static String getRiskManagement = base_url_host + "/manager_rm";
        /**
         * 获取某单位管辖的楼
         */
        public static String getProjectsOfUnit = base_url_host+ "/projectsOfUnit";
        /**
         * 获取某楼某施工单位管辖的主节点getTopCodesOfUnit
         */
        public static String getTopCodesOfUnit = base_url_host + "/topCodesOfUnit";
        /**
         * 按施工单位
         */
        public static String getPackageUnitsOfProject = base_url_host + "/packageUnitsOfProject";
        /**
         * 获取任务列表 (可按节点,可搜索）
         */
        public static String getPhoneTasks = base_url_host + "/phoneTasks";
        /**
         * 获取层列表
         */
        public static String getFloors = base_url_host + "/floors";
        /**
         * 获取段列表
         */
        public static String getSections = base_url_host + "/sections";
        /**
         * 获取子节点列表
         */
        public static String getchildcodes_url = base_url_host + "/childCodes";
        /**
         * 分配任务
         */
        public static String getalltask_url = base_url_host + "/assignTaskInfo";
        /**
         * 获取好友列表
         */
        public static String getFriends = base_url_host + "/friends";
        /**
         * 获取他人资料
         */
        public static String getOtherUser = base_url_host + "/otherUser";
        /**
         * 添加好友
         */
        public static String addFriend = base_url_host + "/friendship";

        /**
         * 大事记
         */
        public static String inProjectBigEvents = base_url_host + "/events";
        /**
         * 大事记详情
         */
        public static String inProjectBigEventsDetails = base_url_host + "/event/";

        /**
         * 工程状态
         */
        public static String riskCur = base_url_host + "/risk_cur";

        /**
         * 工程状态级别
         */
        public static String EngineeringStateLevel = base_url_host
                + "/acceptanceStatistics";

        /**
         * 工状态资料
         */
        public static String EngineeringStateData = base_url_host
                + "/acceptanceStatistics";

        /**
         * 项目详情中项目简介
         */
        public static String InProjectDescription = base_url_host
                + "/projectGroup/";

        /**
         * 通知界面接口
         */
        public static String NoticeFragment = base_url_host + "/phoneNotices";


        /**
         * 日志列表
         */
        public static String getUserLogs = base_url_host + "/userLogs";

        /**
         * 设计文件
         */
        public static String DesignFragmentUrl = base_url_host + "/designs";


        /**
         * 获得所有监理公司
         */
        public static String getSupervisionUnits = base_url_host
                + "/supervisionUnits";
        /**
         * 获取历史评价
         */
        public static String getHistoryEvaluate = base_url_host
                + "/appraisalsOfUser";
        /**
         * 根据手机号查询好友
         */
        public static String getfriendurl = base_url_host + "/findUserByPhone";
        /**
         * 获取我的群聊
         */
        public static String getGroups = base_url_host + "/groups";
        /**
         * 获取群组信息 按group_id--getGroup
         */
        public static String getGroup = base_url_host + "/group";
        /**
         * 是否保存到通讯录
         */
        public static String isShowContacturl = base_url_host + "/groupIsShow";
        /**
         * 邀请他人加入该群
         */
        public static String inviteUsersJoinGroup = base_url_host
                + "/inviteUsersJoinGroup";
        /**
         * 提出群组(只有群主才能踢人)
         */
        public static String kitoutgroup = base_url_host + "/kickOutGroup";
        /**
         * 获取省份列表
         */
        public static String getProvinces = base_url_host + "/provinces";

        /**
         * 获取城市列表
         */
        public static String getCities = base_url_host + "/cities/";

        /**
         * 获取城市中的区列表
         */
        public static String getDistricts = base_url_host + "/districts/";

        /**
         * 获取所有项目公司
         */
        public static String getUnitsByType = base_url_host + "/unitsByType";

        /**
         * 获取人员列表
         */
        public static String getusersOfProjectGroupUnit = base_url_host
                + "/usersOfProjectGroupUnit";

        /**
         * 上传评论内容接口
         */
        public static String getappraiseBatch = base_url_host + "/appraiseBatch";
        /**
         * 删除好友
         */
        public static String deletefriend = base_url_host + "/friend";
        /**
         * 发起群聊
         */
        public static String initgroupchat = base_url_host + "/group";
        /**
         * 发布招标
         */
        public static String addInvitation = base_url_host + "/addInvitation";

        /**
         * 获取某公司的所有用户（通过审核）
         */
        public static String getUsersOfUnit = base_url_host + "/usersOfUnit";
        /**
         * 添加反馈信息
         */
        public static String addFeedback = base_url_host + "/feedback";
        /**
         * 获取本人信息
         */
        public static String getMe = base_url_host + "/me";

        /**
         * 某用户的评价列表（收到的评价）
         */
        public static String getAppraisalsOfUser = base_url_host+ "/appraisalsOfUser";

        /**
         * 某用户给出的评价列表
         */
        public static String getAppraisalsOfUserGive = base_url_host+ "/appraisalsOfUserGive";

        /**
         * 校验原手机号
         */
        public static String verifyOldPhone = base_url_host + "/verifyOldPhone";

        /**
         * 校验新手机号
         */
        public static String verifyNewPhone = base_url_host + "/verifyNewPhone";

        /**
         * 修改密码
         */
        public static String updatePassword = base_url_host + "/password";

        /**
         * 某类型某专业验收任务列表
         */
        public static String getAcceptanceTasks = base_url_host
                + "/acceptanceTasks";

        /**
         * 获取任务结果详情
         */
        public static String getTaskResult = base_url_host + "/taskResult";

        /**
         * 获取进度详情url
         */
        public static String scheduleResult = base_url_host + "/scheduleResult";
        /**
         * 获取项目（小区）的所有公司用户列表 ( 按公司分组- 用户) getUsersOfProjectGroup 获取项目的某类用户(一级列表)
         */
        public static String getUsersOfProjectGroup = base_url_host
                + "/usersOfProjectGroup";
        /**
         * 	获取项目的某类用户(一级列表) getUsersOfProjectGroupV2
         */
        public static String getUsersOfProjectGroupV2 = base_url_host
                + "/getUsersOfProjectGroupV2";

        /**
         * 获取工程相关方列表
         */
        public static String getUnitsOfProjectGroup = base_url_host
                + "/unitsOfProjectGroup";
        /**
         * 事故详情
         */
        public static String getAccidentTreatmentById = base_url_host
                + "/accidentTreatmentById";
        /**
         * 进度列表
         */
        public static String getPhoneSchedules = base_url_host + "/phoneSchedules";
        /**
         * 事故任务列表
         */
        public static String getAccidentTreatments = base_url_host
                + "/phoneAccidents";
        /**
         * 获取月计量列表(手机端)--getPhoneMeasurements
         */
        public static String getPhoneMeasurements = base_url_host
                + "/phoneMeasurements";

        /**
         * 获取月计量详情(pad及手机端）--getMeasurement
         */
        public static String getMeasurement = base_url_host + "/measurement";


        /**
         * 获取变更列表（可同时用于手机端）--getChanges
         */
        public static String getChanges = base_url_host + "/changes/";

        /**
         * 获取会审详情（该会审的文件列表）--getJointChecking
         */
        public static String getJointChecking = base_url_host + "/jointChecking/";


        /**
         * 获取变更详情（可同时用于手机端）--getChange
         */
        public static String getChange = base_url_host + "/change/";
        /**
         * 获取某公司的所有历史项目
         */
        public static String getProjectGroupsOfUnit = base_url_host+ "/projectGroupsOfUnit";
        /**
         * 获取某公司的所有用户(通过审核)--getUsersOfUnit
         */
        public static String getUsersOfUnits = base_url_host + "/usersOfUnit";

        /**
         * 修改头像(v1.0)--updateHead
         */
        public static String updateHead = base_url_host + "/head";

        /**
         * 获得某人的个人简介--getPersonalProfile
         */
        public static String getPersonalProfile = base_url_host+ "/personalProfile/";
        /**
         * 更新个人简介--updatePersonalProfile
         */
        public static String updatePersonalProfile = base_url_host+ "/updatePersonalProfile";
        /**
         * 更新职业资格证
         */
        public static String updateUserLicense = base_url_host + "/userLicense";
        /**
         * 更新毕业证书
         */
        public static String updateUserDiploma = base_url_host + "/userDiploma";
        /**
         * 身份证updateUserIdentityCard
         */
        public static String updateUserIdentityCard = base_url_host
                + "/userIdentityCard";
        /**
         * 更新用户职称证书--updateUserTitleCertificate
         */
        public static String updateUserTitleCertificate = base_url_host
                + "/userTitleCertificate";
        /**
         * 更新用户聘用凭证（任用书）--updateUserIdentityDocument
         */
        public static String updateUserIdentityDocument = base_url_host+ "/userIdentityDocument";
        /**
         * 获取某用户的所有历史项目--getHistoryProjectGroupsOfUser
         */
        public static String getHistoryProjectGroupsOfUser = base_url_host+ "/historyProjectGroupsOfUser";
        /**
         * 删除用户相关图片
         */
        public static String deleteUserImg = base_url_host + "/userImg/";
        /**
         * 获取某公司的详情
         */
        public static String getUnitInfo = base_url_host + "/unit";
        /**
         * 修改公司图片
         */
        public static String updateUnitImg = base_url_host + "/unitImg";
        /**
         * 获取该资料类型的文件列表 (用于手机端、iPad端）
         */
        public static String getDocumentMimes = base_url_host + "/documentMimes";
        /**
         * 使用说明书
         */
        public static String instructionManual = "http://123.56.157.182/dhyt/template/about/InstructionsForPhone.pdf";
        /**
         * 服务协议
         */
        public static String serviceAgreement = "http://123.56.157.182/dhyt/web/about/service_protocols.html";
        /**
         * 法律协议
         */
        public static String legalInstrument = "http://123.56.157.182/dhyt/web/about/law.html";

        /**
         * 匹配手机通讯录
         */
        public static String matchPhonebook = base_url_host + "/matchPhonebook";
        /**
         * 上传会议文件、修改会议纪要
         */
        public static String uploadMeetingMime = base_url_host
                + "/uploadMeetingMime";
        /**
         * 修改用户信息并重新提交审核( 审核失败的用户)
         */
        public static String applyUserAgain = base_url_host + "/applyUserAgain";
        /**
         * 修改公司信息并重新提交( 审核失败的)
         */
        public static String applyUnitAgain = base_url_host + "/applyUnitAgain";

        /**
         * 获取监理需求某类别的所有人员--getUnitClassfyUsers
         */

        public static String getUnitClassfyUsers = base_url_host
                + "/unitClassfyUsers";
        /**
         * 获取某一类型的风险评估历史 （工程概况-风险评估）--getRisks
         */
        public static String getRisks = base_url_host + "/risks";
        /**
         * 获得通知列表
         */
        public static String getExtraNotices = base_url_host + "/extraNotices";

        /**
         * 获得施工通知列表
         */
        public static String getProgressNotices = base_url_host + "/getProgressNotices";
        /**
         * 新建通知
         */
        public static String addExtraNotice = base_url_host + "/addExtraNotice";
        /**
         * 获取DPM任务列表--getEextraTasks
         */
        public static String getEextraTasks = base_url_host + "/extraTasks";
        /**
         * getEextraTask--获取DPM任务详情
         */
        public static String getEextraTask = base_url_host + "/extraTask";
        /**
         * 确认DPM任务（仅分配人可操作）--confirmExtraTask
         */
        public static String confirmExtraTask = base_url_host + "/confirmExtraTask";
        /**
         * 获得项目相关方（除自己单位）
         */
        public static String getRelatedUnitsExceptMe = base_url_host
                + "/relatedUnitsExceptMe";
        /**
         * 执行DPM任务--executeExtraTask
         */
        public static String executeExtraTask = base_url_host + "/executeExtraTask";
        /**
         * 获取工程报建的任务(某层级)--getAppConsts
         */
        public static String getAppConsts = base_url_host + "/appConsts";
        /**
         * 获取监控列表
         */
        public static String getCamerasByUserId = base_url_host
                + "/getCamerasByUserId";
        /**
         * 添加监控设备
         */
        public static String addCamera = base_url_host + "/addCamera";


        /**
         * 查看设备详情
         */
        public static String getCameraByCameraId = base_url_host
                + "/getCameraByCameraId";
        /**
         * 获取可共享的开发商用户列表
         */
        public static String getUserListForCamera = base_url_host
                + "/getUserListForCamera";
        /**
         * 修改监控设备信息
         */
        public static String updateCamera = base_url_host + "/updateCamera";
        /**
         * 删除监控设备信息
         */
        public static String deleteCameraByCameraId = base_url_host
                + "/deleteCameraByCameraId";

        /**
         * 获取工程报建任务列表（关于我的）--getAppConstTasks
         */
        public static String getAppConstTasks = base_url_host + "/appConstTasks";
        /**
         * 获取工程报建任务详情--getAppConstTask
         */
        public static String getAppConstTask = base_url_host + "/appConstTask";
        /**
         * 执行工程报建任务--executeAppConstTask
         */
        public static String executeAppConstTask = base_url_host
                + "/executeAppConstTask";
        /**
         * 确认(反驳)工程报建任务--confirmAppConstTask
         */
        public static String confirmAppConstTask = base_url_host
                + "/confirmAppConstTask";
        /**
         * 添加实测实量小组的成员（工程部经理807 才可添加）
         */
        public static String addActualMeasureMembers = base_url_host
                + "/actualMeasureMembers";
        /**
         * 获取实测实量的权限
         */
        public static String getActualMeasureMembers = base_url_host
                + "/actualMeasureMembers";

        /**
         * 获取可以入选实测实量小组的成员(所有公司 已去掉已添加的用户)
         */
        public static String getActualMeasureCanJoinUnitsUsers = base_url_host
                + "/actualMeasureCanJoinUnitsUsers";
        /**
         * 修改实测实量小组成员的权限
         */
        public static String updateActualMeasureMembers = base_url_host
                + "/actualMeasureMembers";
        /**
         * 获取实测实量的权限
         */
        public static String getActualMeasureAuthorization = base_url_host
                + "/actualMeasureAuthorization";
        /**
         * 添加工程报建自定义任务
         */
        public static String addAppConstCustomItem = base_url_host
                + "/appConstCustomItem";
        /**
         * 修改工程报建自定义任务名称(添加人可修改)
         */
        public static String updateAppConstCustomItem = base_url_host
                + "/appConstCustomItem";
        /**
         * 删除工程报建自定义任务名称（添加人且未分配可删除 ）
         */
        public static String deleteAppConstCustomItem = base_url_host
                + "/appConstCustomItem";
        /**
         * 分配工程报建任务(任务未分配可执行 开发商经理级别)
         */
        public static String addAndAssignAppConstTask = base_url_host
                + "/addAndAssignAppConstTask";
        /**
         * 获取工程报建的可分配人员列表
         */
        public static String getUsersOfAssignAppConst = base_url_host
                + "/usersOfAssignAppConst";
        /**
         * 重新分配工程报建任务(任务已分配未开始可修改 开发商经理级别)
         */
        public static String againAssignAppConstTask = base_url_host
                + "/againAssignAppConstTask";
        /**
         * 工程报建是否设置计划时间(000_003任务确认完时执行)
         */
        public static String isAppConstNeedPlan = base_url_host
                + "/isAppConstNeedPlan";
        /**
         * 添加实测实量自定义任务
         */
        public static String addActualMeasureCustomItem = base_url_host
                + "/actualMeasureCustomItem";
        /**
         * 获取任务列表 (搜索）(用于手机端) --getPhoneTasksBySearch
         */
        public static String getPhoneTasksBySearch = base_url_host
                + "/getPhoneTasksBySearch";


        /**
         * 获取实测实量的预加载任务(某层级 包含自定义任务)
         */
        public static String getActualMeasureItems = base_url_host
                + "/actualMeasureItems";

        /**
         * 删除实测实量自定义任务名称（添加人且未分配可删除 ）--deleteActualMeasureCustomItem
         */
        public static String deleteActualMeasureCustomItem = base_url_host
                + "/actualMeasureCustomItem";
        /**
         * 修改实测实量自定义任务名称（添加人可修改）
         */
        public static String updateActualMeasureCustomItem = base_url_host
                + "/actualMeasureCustomItem";

        /**
         * 获取某项目的所有楼(不分组 不含位置信息)
         */
        public static String getProjects = base_url_host + "/projects";
        /**
         * 分配实测实量任务(组织者可分配)
         */
        public static String assignActualMeasure = base_url_host
                + "/assignActualMeasure";
        /**
         * 获得交房模块进入的权限--getHouseDeliveryAuthorization
         */
        public static String getHouseDeliveryAuthorization = base_url_host
                + "/houseDeliveryAuthorization";
        /**
         * 获得交房小组列表--getHouseDeliveryTeam
         */
        public static String getHouseDeliveryTeam = base_url_host
                + "/houseDeliveryTeam";
        /**
         * 获得交房小组可参与人员列表（甲方公司、 已除去小组已有的成员）--getHouseDeliveryCanJoinUsers
         */
        public static String getHouseDeliveryCanJoinUsers = base_url_host
                + "/houseDeliveryCanJoinUsers";

        /**
         * 获得可以被转移管理者权限的人员列表（一级用户）--getHouseDeliveryCanManagerUsers
         */
        public static String getHouseDeliveryCanManagerUsers = base_url_host
                + "/houseDeliveryCanManagerUsers";
        /**
         * 转让管理者权限（管理者才可以）--transferTeamManagerPrivilege
         */
        public static String transferTeamManagerPrivilege = base_url_host
                + "/transferTeamManagerPrivilege";
        /**
         * 初始化楼、层、房信息--initHouseDeliveryRooms
         */
        public static String initHouseDeliveryRooms = base_url_host
                + "/initHouseDeliveryRooms";
        /**
         * 获得交房单元列表（残缺：暂无任务相关的，后加）
         */
        public static String getHouseDeliveryUnits = base_url_host
                + "/houseDeliveryUnits";
        /**
         * deleteHouseDeliveryUnit 删除交房某个单元
         */
        public static String deleteHouseDeliveryUnit = base_url_host
                + "/houseDeliveryUnit";
        /**
         * 修改单元名称 updateHouseDeliveryUnitName
         */
        public static String updateHouseDeliveryUnitName = base_url_host
                + "/updateHouseDeliveryUnitName";
        /**
         * 获取实测实量任务结果详情
         */
        public static String getActualMeasureTask = base_url_host
                + "/actualMeasureTask";
        /**
         * 确认(反驳)实测实量任务
         */
        public static String confirmActualMeasureTask = base_url_host
                + "/confirmActualMeasureTask";
        /**
         * 获取实测实量测量区详情
         */
        public static String getActualMeasureArea = base_url_host
                + "/actualMeasureArea";
        /**
         * 添加测量区
         */
        public static String addActualMeasureArea = base_url_host
                + "/addActualMeasureArea";
        /**
         * 修改测量区
         */
        public static String updateActualMeasureArea = base_url_host
                + "/updateActualMeasureArea";
        /**
         * 执行实测实量任务
         */
        public static String executeActualMeasureTask = base_url_host
                + "/executeActualMeasureTask";
        /**
         * 获取实测实量某执行人的执行任务详情(用于执行任务)
         */
        public static String getActualMeasureUserTask = base_url_host
                + "/actualMeasureUserTask";
        /**
         * 生成复检任务（分配人才可, 且当前任务已确认）
         */
        public static String addActualMeasureTaskReview = base_url_host
                + "/addActualMeasureTaskReview";
        /**
         * 删除测量区(添加人 执行中 可删)
         */
        public static String deleteActualMeasureArea = base_url_host
                + "/deleteActualMeasureArea";

        /**
         * 获得交房任务列表--getHouseDeliveryTasks
         */
        public static String getHouseDeliveryTasks = base_url_host
                + "/houseDeliveryTasks";

        /**
         * 转让楼管理者权限（管理者才可以）transferProjectManagerPrivilege
         */
        public static String transferProjectManagerPrivilege = base_url_host
                + "/transferProjectManagerPrivilege";
        /**
         * 获得交房房间列表 getHouseDeliveryRooms
         */
        public static String getHouseDeliveryRooms = base_url_host
                + "/houseDeliveryRooms";
        /**
         * 删除某个房间
         */
        public static String deleteHouseDeliveryRoom = base_url_host
                + "/deleteHouseDeliveryRoom";
        /**
         * 修改房间名称
         */
        public static String updateHouseDeliveryRoomName = base_url_host
                + "/updateHouseDeliveryRoomName";

        /**
         * 获得可以被分配任务的人员列表--getHouseDeliveryTaskCanAssignUsers
         */
        public static String getHouseDeliveryTaskCanAssignUsers = base_url_host
                + "/houseDeliveryTaskCanAssignUsers/";

        /**
         * 获得预加载任务列表（某层级、包括自定义节点、自定义的任务）
         */
        public static String getHouseDeliveryPreTasks = base_url_host
                + "/houseDeliveryPreTasks";
        /**
         * 添加自定义节点、任务
         */
        public static String addHouseDeliveryCustomNodeOrTask = base_url_host
                + "/addHouseDeliveryCustomNodeOrTask";


        /**
         * 获取实测实量末节点列表（全部、我分配的、我执行的）
         */
        public static String getActualMeasureNodes = base_url_host
                + "/actualMeasureNodes";
        /**
         * 获取实测实量末节点的任务列表
         */
        public static String getActualMeasureTasksOfNode = base_url_host
                + "/actualMeasureTasksOfNode";

        /**
         * 分配任务--assignHouseDeliveryTask
         */
        public static String assignHouseDeliveryTask = base_url_host
                + "/assignHouseDeliveryTask";

        /**
         * 获取实测实量通知列表--getActualMeasureNotices
         */
        public static String getActualMeasureNotices = base_url_host
                + "/actualMeasureNotices";

        /**
         * 获取实测实量所有的末节点列表（用于统计-选择节点）
         */
        public static String getActualMeasureLastNodes = base_url_host
                + "/actualMeasureLastNodes";

        /**
         * 获取实测实量统计节点列表（某楼 某节点 仅已确认的 ）
         */
        public static String getActualMeasureConfirmedNodes = base_url_host
                + "/actualMeasureConfirmedNodes";
        /**
         * 完成户--finishHouseDeliveryRoom
         */
        public static String finishHouseDeliveryRoom = base_url_host
                + "/finishHouseDeliveryRoom";
        /**
         * 某人的任务详情(执行界面调用)--getHouseDeliveryMemberTask
         */
        public static String getHouseDeliveryMemberTask = base_url_host
                + "/houseDeliveryMemberTask/";

        /**
         * 执行交房任务
         */
        public static String executeHouseDeliveryTask = base_url_host
                + "/executeHouseDeliveryTask";

        /**
         * 确认(反驳)交房任务--confirmHouseDeliveryTask
         */
        public static String confirmHouseDeliveryTask = base_url_host
                + "/confirmHouseDeliveryTask";

        /**
         * 任务详情--getHouseDeliveryTaskById
         */
        public static String getHouseDeliveryTaskById = base_url_host
                + "/houseDeliveryTaskById/";

        /**
         * 修改交房某单元的图片--updateHouseDeliveryUnitImg
         */
        public static String updateHouseDeliveryUnitImg = base_url_host
                + "/houseDeliveryUnitImg";
        /**
         * 修改交房某层的图片--updateHouseDeliveryFloorImg
         */
        public static String updateHouseDeliveryFloorImg = base_url_host
                + "/houseDeliveryFloorImg";
        /**
         * 分配实测实量末节点(批量包含任务详情 ，is_last_node=1时组织者可分配)
         */
        public static String assignActualMeasureNodeTasks = base_url_host
                + "/assignActualMeasureNodeTasks";
        /**
         * 修改户备注--updateHouseDeliveryRoomComment
         */
        public static String updateHouseDeliveryRoomComment = base_url_host
                + "/houseDeliveryRoomComment";
        /**
         * 添加小组成员(批量)--addHouseDeliveryTeamUsers
         */
        public static String addHouseDeliveryTeamUsers = base_url_host
                + "/addHouseDeliveryTeamUsers";
        /**
         * 创建变洽签任务（目前仅开发商人员可创建）--addBqqMainTask
         */
        public static String addBqqMainTask = base_url_host + "/bqqMainTask";
        /**
         * 获取变洽签任务列表--getBqqMainTasks
         */
        public static String getBqqMainTasks = base_url_host + "/bqqMainTasks";
        /**
         * 获取变洽签模块管理者--getBqqManager
         */
        public static String getBqqManager = base_url_host + "/bqqManager";
        /**
         * updateBqqManager 移交变洽签模块管理者权限给他人
         */
        public static String updateBqqManager = base_url_host + "/bqqManager";
        /**
         * getBqqApprover 获取变洽签模块批准人
         */
        public static String getBqqApprover = base_url_host + "/bqqApprover";
        /**
         * 获取变洽签小组管理列表--getBqqAuths
         */
        public static String getBqqAuths = base_url_host + "/bqqAuths";
        /**
         * 获取变洽签小组管理详情--getBqqAuth
         */
        public static String getBqqAuth = base_url_host + "/bqqAuth";
        /**
         * 获取变洽签小组查看人列表--getBqqAuthViewers
         */
        public static String getBqqAuthViewers = base_url_host + "/bqqAuthViewers";
        /**
         * 获取我管辖的工程师 (包含总监)--getUnderUsersWithOwn
         */
        public static String getUnderUsersWithOwn = base_url_host
                + "/underUsersWithOwn/";
        /**
         * 修改变洽签小组岗位人员--updateBqqAuthPost
         */
        public static String updateBqqAuthPost = base_url_host + "/bqqAuthPost";
        /**
         * 修改变洽签小组查看人--updateBqqAuthViewers
         */
        public static String updateBqqAuthViewers = base_url_host
                + "/bqqAuthViewers";
        /**
         * 获取变洽签任务详情--getBqqMainTask
         */
        public static String getBqqMainTask = base_url_host + "/bqqMainTask";

        /**
         * 主责人执行主任务 （type==1,is_task=1） （v1.0 2015-07-30）--leaderTask
         */
        public static String leaderTask = base_url_host + "/leaderTask";

        /**
         * 协助人执行任务 （type==2，本人的任务） （v1.0 2015-07-30）
         */
        public static String assistTask = base_url_host + "/assistTask";
        /**
         * 主责人确认子任务 （is_subtask=1）（v1.0 2015-07-30）
         */
        public static String leaderConfirmSubtask = base_url_host
                + "/leaderConfirmSubtask";

        /**
         * 获取实测实量报表
         */
        public static String getActualMeasureReport = base_url_host
                + "/actualMeasureReport";
        /**
         * 获得 月报 周报 日报 列表--getReportsYearMonthDay
         */
        public static String getReportsYearMonthDay = base_url_host + "/reports";
        /**
         * 获取月报/周报/日报详情--getReport
         */
        public static String getReport = base_url_host + "/report";

        /**
         * 获取工程师任务（或总监自安排任务）详情 （v1.0 2015-07-28）
         */
        public static String getEngineerTask = base_url_host + "/engineerTask";

        /**
         * 获取某项目某天的天气数据
         */
        public static String getWeatherOfDay = base_url_host + "/weatherOfDay";

        /**
         *新建日志
         */
        public static String addNewUserLog = base_url_host + "/addNewUserLog";

        /**
         * 修改日志（未审阅可修改）
         */
        public static String updateUserLog = base_url_host + "/updateUserLog";
        /**
         * 审阅日志
         */
        public static String CheckUserLog = base_url_host + "/CheckUserLog";
        /**
         * 获取月报/周报/日报详情--getReport 新的详情
         */
        public static String getReportNew = base_url_host + "/report";
        /**
         *监理日志预生成
         */
        public static String getPreUserLog = base_url_host
                + "/getPreUserLog";

        /**
         * 获取资料列表（用于手机端）（任务-按资料）--getPhoneDocuments
         */
        public static String getPhoneDocuments = base_url_host + "/phoneDocuments";
        /**
         * 获取某资料的任务列表 (用于手机端）--getPhoneTasksOfDoc
         */
        public static String getPhoneTasksOfDoc = base_url_host
                + "/phoneTasksOfDoc";
        /**
         * 上传移动端错误信息--addMobileError
         */
        public static String addMobileError = base_url_host + "/open/mobileError";
        /**
         * 修改月报/周报/日报--updateReport
         */
        public static String updateReport = base_url_host + "/updateReport";
        /**
         * 监理审核--getIs_verified
         */
        public static String getIs_verified = base_url_host + "/is_verified";

        /**
         * 确认通知（签收或拒绝） 总监 （v1.0 2015-08-07）
         */
        public static String confirmNotice = base_url_host + "/confirmNotice";
        /**
         * 通知销项 总监(单个 有图片)
         */
        public static String outputNotice = base_url_host + "/outputNotice";

        /**
         * 获取通知的模板样板（v1.0 2015-08-12）
         */
        public static String getNoticeTemplate = base_url_host + "/noticeTemplate";

        /**
         * 获取通知列表 总监 (含搜索)
         */
        public static String getManagerNotices = base_url_host + "/manager_notices";
        /**
         * 获取群组信息 按em_group_id--getGroupByEmId
         */
        public static String getGroupByEmId = base_url_host + "/groupByEmId";
        /**
         * 获取某任务的通知列表
         */
        public static String getTaskNotices = base_url_host + "/taskNotices";
        /**
         * 任务界面添加通知 （工程师/总监）
         */
        public static String addTaskNotice = base_url_host + "/task_notice_new";
        /**
         * getBqqTask 获取变洽签中某步骤任务详情(目前仅实现item_seq=2 7)
         */
        public static String getBqqTask = base_url_host + "/bqqTask";
        /**
         * 变洽签签名(目前仅item_seq=2支持签认)signBqqTask
         */
        public static String signBqqTask = base_url_host + "/signBqqTask";
        /**
         * 实测实量上传图片到任务(最多3张 节点级别)
         */
        public static String uploadActualMeasureTaskImg = base_url_host
                + "/uploadActualMeasureTaskImg";
        /**
         * 获取实测实量节点的图片
         */
        public static String getActualMeasureTaskImgs = base_url_host
                + "/actualMeasureTaskImgs";

        /**
         * 实测实量删除任务图片
         */
        public static String deleteActualMeasureTaskImg = base_url_host
                + "/actualMeasureTaskImg";
        /**
         * 获取任务执行列表(仅支持item_seq=3 )
         */
        public static String getBqqTaskUsers = base_url_host + "/bqqTaskUsers";
        /**
         * 获取任务执行人执行详情(仅支持item_seq=3 )
         */
        public static String getBqqTaskUser = base_url_host + "/bqqTaskUser";
        /**
         * 变更签岗位人员分配任务(仅支持item_seq=1/3/4/5/6 ,子分配不可用)
         */
        public static String postAssignBqqTask = base_url_host
                + "/postAssignBqqTask";
        /**
         * approveBqqMainTask批准变洽签任务
         */
        public static String approveBqqMainTask = base_url_host
                + "/approveBqqMainTask";
        /**
         * 执行任务(仅支持item_seq=1/3/4/5/6 )
         */
        public static String executeBqqTaskUser = base_url_host
                + "/executeBqqTaskUser";

        /**
         * 岗位人确认完成任务(仅支持item_seq=1/3/4/5/6, 4可驳回, 1可停止,子分配不可用)
         */
        public static String postConfirmBqqTask = base_url_host
                + "/postConfirmBqqTask";

        /**
         * 对接施工单位费用申报人(仅支持item_seq=4)
         */
        public static String chooseBqqTaskApplicant = base_url_host
                + "/chooseBqqTaskApplicant";
        /**
         * 费用申报(仅支持item_seq=4)
         */
        public static String applyBqqCost = base_url_host + "/applyBqqCost";
        /**
         * 获取被驳回的申报列表(仅支持item_seq=4且has_history=1)
         */
        public static String getBqqRejectedApplys = base_url_host
                + "/bqqRejectedApplys";
        /**
         * getExecutorBqqTasks获取变洽签执行人任务列表(我的-被分配的)
         */
        public static String getExecutorBqqTasks = base_url_host
                + "/executorBqqTasks";
        /**
         * checkBqqTaskMimes 选择/取消选择任务文件(仅支持item_seq=1)
         */
        public static String checkBqqTaskMimes = base_url_host
                + "/checkBqqTaskMimes";
        /**
         * getUserSignature 获取用户签名照
         */
        public static String getUserSignature = base_url_host + "/getUserSignature";
        /**
         * updateUserSignature为用户添加签名图片
         */
        public static String updateUserSignature = base_url_host
                + "/updateUserSignature";

        /**
         * deleteDepartment 接口用途： 解散部门(人员管理管理员可操作)
         */
        public static String deleteDepartment = base_url_host + "/department";
        /**
         * updateAttendanceDetailComment 接口用途： 修改考勤备注(包括图片，最多四张)
         */
        public static String updateAttendanceDetailComment = base_url_host
                + "/attendanceDetailComment";
        /**
         * getAttendanceDetails 接口用途： 获取考勤详情列表
         */
        public static String getAttendanceDetails = base_url_host
                + "/attendanceDetails";
        /**
         * getMyAttendanceRecord 接口用途： 获取自己的考勤记录（某月）
         */
        public static String getMyAttendanceRecord = base_url_host
                + "/myAttendanceRecord";
        /**
         * clock 接口用途： 考勤打卡
         */
        public static String clock = base_url_host + "/clock";
        /**
         * getAttendanceDayRecord 接口用途： 获取考勤日记录
         */
        public static String getAttendanceDayRecord = base_url_host
                + "/attendanceDayRecord";
        /**
         * getMyTodayAttendance 接口用途： 获取打卡前所需信息(考勤设置，本人打卡情况，系统时间，管理的部门)
         */
        public static String getMyTodayAttendance = base_url_host
                + "/myTodayAttendance";
        /**
         * updateAttendanceOn 接口用途： 开启/关闭考勤功能(人员管理管理员可操作)
         */
        public static String updateAttendanceOn = base_url_host + "/attendanceOn";
        /**
         * getAttendanceSetting 接口用途： 获取考勤设置(人员管理管理员可操作)
         */
        public static String getAttendanceSetting = base_url_host
                + "/attendanceSetting";
        /**
         * updateAttendanceSetting 接口用途： 修改考勤设置(人员管理管理员可操作)
         */
        public static String updateAttendanceSetting = base_url_host
                + "/attendanceSetting";
        /**
         * deleteDepartmentPersonnels 接口用途： 删除部门人员(部门负责人可操作，批量，不可删除负责人)
         */
        public static String deleteDepartmentPersonnels = base_url_host
                + "/departmentPersonnels";
        /**
         * addDepartmentPersonnels 接口用途： 添加部门人员(部门负责人可操作，批量)
         */
        public static String addDepartmentPersonnels = base_url_host
                + "/departmentPersonnels";
        /**
         * changeDepartmentManager 接口用途： 变更部门负责人(人员管理管理员可操作,原管理员将被移除部门)
         */
        public static String changeDepartmentManager = base_url_host
                + "/departmentManager";
        /**
         * changePersonalManagementManager 接口用途： 移交人员管理管理员(人员管理管理员可操作)
         */
        public static String changePersonalManagementManager = base_url_host
                + "/personalManagementManager";
        /**
         * updateDepartmentName 接口用途： 修改部门名称(人员管理管理员可操作)
         */
        public static String updateDepartmentName = base_url_host
                + "/departmentName";
        /**
         * getPersonalManagement 接口用途： 获取人员管理信息(管理员、模块设置)
         */
        public static String getPersonalManagement = base_url_host
                + "/personalManagement";
        /**
         * getDepartment 接口用途： 获取部门详情(包括人员列表)
         */
        public static String getDepartment = base_url_host + "/department";
        /**
         * meetingSign 接口用途： 会议人员签到
         */
        public static String meetingSign = base_url_host + "/meetingSign";
        /**
         * getDepartments 接口用途： 获取部门列表
         */
        public static String getDepartments = base_url_host + "/departments";
        /**
         * 新建部门(人员管理管理员可操作)
         */
        public static String addDepartment = base_url_host + "/department";
        /**
         * queryNewsCount 接口用途： 获得系统消息总的条数
         */
        public static String queryNewsCount = base_url_host + "/queryNewsCount";
        /**
         * getKaoQinSetting
         * 接口用途：	获得考勤数据库信息(管理员可看)
         */
        public static String getKaoQinSetting = base_url_host + "/kaoQinSetting";
        /**
         * updateKaoQinSetting
         * 接口用途：	设置考勤数据库信息(管理员可设置)
         */
        public static String updateKaoQinSetting = base_url_host + "/kaoQinSetting";
        /**
         * addKaoQinMembers
         * 接口用途：	添加中移动考勤查看人（管理员可操作）
         */
        public static String addKaoQinMembers = base_url_host + "/kaoQinMembers";
        /**
         * deleteKaoQinMembers
         * 接口用途：	删除中移动考勤查看人（管理员可操作）
         */
        public static String deleteKaoQinMembers = base_url_host + "/kaoQinMembers";
        /**
         * getKaoQinEmployeeEventsReport
         * 接口用途：	获得考勤情况-员工详情表（网页报告版）
         */
        public static String getKaoQinEmployeeEventsReport = base_url_host + "/kaoQinEmployeeEventsReport";
        /**
         * getKaoQinDeptEventsReport
         * 接口用途：	获得考勤情况-部门详情表（网页报告版）
         */
        public static String getKaoQinDeptEventsReport = base_url_host + "/kaoQinDeptEventsReport";
        /**
         * getKaoQinEmployees
         * 接口用途：	查询考勤人员（仅返回前50人）
         */
        public static String getKaoQinEmployees = base_url_host + "/kaoQinEmployees";
        /**
         * getKaoQinMembers
         * 接口用途：	获得考勤成员列表（包含普通管理员、查看人，管理员可见）
         */
        public static String getKaoQinMembers = base_url_host + "/kaoQinMembers";
        /**
         * updateKaoQinManager
         * 接口用途：	修改中移动考勤普通管理员（超级管理员可操作）
         */
        public static String updateKaoQinManager = base_url_host + "/kaoQinManager";
        /**
         * getKaoQinDeptCollect
         * 接口用途：	获得考勤情况-部门汇总表
         */
        public static String getKaoQinDeptCollect = base_url_host + "/kaoQinDeptCollect";
        /**
         * queryNewsLines 接口用途： 获得系统消息分页列表
         */
        public static String queryNewsLines = base_url_host + "/queryNewsLines";
        /**
         * getNewsByid 接口用途： 查看系统消息详情
         */
        public static String getNewsByid = base_url_host + "/getNewsByid";
        /**
         * getReferences 接口用途： 获取参考资料列表
         */
        public static String getReferences = base_url_host + "/references";
        /**
         * 申报人分配任务
         */
        public static String applicantAssignBqqTask = base_url_host
                + "/applicantAssignBqqTask";
        /**
         * signBqqTaskFile 变洽签签名[第一步-上传签名后的文件](目前仅item_seq=2支持签认)
         */
        public static String signBqqTaskFile = base_url_host + "/signBqqTaskFile";
        /**
         * signBqqTaskFinish 变洽签签名[第二步-确认签名完成](目前仅item_seq=2支持签认)
         */
        public static String signBqqTaskFinish = base_url_host
                + "/signBqqTaskFinish";
        /**
         * getBqqAccounts 获取变洽签台账列表(可搜索，不传搜默认值)
         */
        public static String getBqqAccounts = base_url_host + "/bqqAccounts";
        /**
         * getHouseDeliveryStatistics 获得交房进度汇总表（项目）
         */
        public static String getHouseDeliveryStatistics = base_url_host
                + "/houseDeliveryStatistics";
        /**
         * getHouseDeliveryProjectStatistics 获得交房进度统计表（单体）
         */
        public static String getHouseDeliveryProjectStatistics = base_url_host
                + "/houseDeliveryProjectStatistics";

        /**
         * 获取某项目下某公司的所有参与用户(附评价信息)
         */
        public static String getUsersOfProjectGroupUnit = base_url_host
                + "/usersOfProjectGroupUnit";
        /**
         * 获取项目的所有用户(以公司分组返回 二级列表)
         */
        public static String getUsersOfProjectGroupByUnit = base_url_host
                + "/usersOfProjectGroupByUnit";

        /**
         * Copy变更签费用申报任务文件(仅支持item_seq=4且executor_level=0)
         */
        public static String checkBqqCostApplyMimes = base_url_host
                + "/checkBqqCostApplyMimes";

        /**
         * 监理通知文件签名(单个 pdf)
         */
        public static String noticeSign = base_url_host + "/noticeSign";

        /**
         * 获取工程师任务一览列表（总监界面）
         */
        public static String getEngineerTaskView = base_url_host
                + "/engineerTasksView";

        /**
         * 任务文件签字（pdf 施工方、总监、执行人）
         */
        public static String taskSign = base_url_host + "/taskSign";
        /**
         * 获取实测实量汇总统计表（整个项目的）
         */
        public static String actualMeasurePGReportHtml = base_url_host
                + "/open/actualMeasurePGReportHtml";
        /**
         * getHouseDeliveryNotices 获取交房整改通知列表
         */
        public static String getHouseDeliveryNotices = base_url_host
                + "/houseDeliveryNotices";
        /**
         * 通知详情
         */
        public static String getNotice = base_url_host + "/notice/";
        /**
         * 获取当前的风险评估等级(项目 小区)
         */
        public static String getRiskCurOfProjectGroup = base_url_host
                + "/riskCurOfProjectGroup/";
        /**
         * getBqqSpecialtys 获取变洽签专业列表
         */
        public static String getBqqSpecialtys = base_url_host + "/bqqSpecialtys";
        /**
         * 修改变洽签任务(未批准之前发起人可修改) updateBqqMainTask
         */
        public static String updateBqqMainTask = base_url_host + "/bqqMainTask";

        /**
         * 获取变洽签主任务执行列表(仅支持approver_assign=1)
         */
        public static String bqqMainTaskUsers = base_url_host + "/bqqMainTaskUsers";
        /**
         * getBqqMainTaskUser
         * 获取变洽签主任务执行人详情
         */
        public static String getBqqMainTaskUser = base_url_host + "/bqqMainTaskUser";
        /**
         * executeBqqMainTaskUser
         * 执行变更签主任务的子任务
         */
        public static String executeBqqMainTaskUser = base_url_host + "/executeBqqMainTaskUser";
        /**
         * Copy选择/取消选择变更签主任务执行人文件
         * checkBqqMainTaskMimes
         */
        public static String checkBqqMainTaskMimes = base_url_host + "/checkBqqMainTaskMimes";
        /**
         * approverAssignBqqMainTask
         * 审批人员分配任务(仅支持 紧急且为设计院/施工方发起的任务)
         */
        public static String approverAssignBqqMainTask = base_url_host + "/approverAssignBqqMainTask";


        /**
         * 获取验收列表
         */
        public static String getComAccLists = base_url_host + "/getComAccLists";
        /**
         * 删除自定义计划
         */
        public static String deleteComAccTaskCustome = base_url_host + "/deleteComAccTaskCustome";
        /**
         * 获取执行人任务详情
         */
        public static String getComAccTaskUserInfo = base_url_host + "/getComAccTaskUserInfo";
        /**
         * 获取任务列表  (新)
         */
        public static String getComAcceTaskLists = base_url_host + "/getComAcceTaskLists";
        /**
         * getAssignUser
         * 获取可分配的人员
         */
        public static String getAssignUser = base_url_host + "/getAssignUser";
        /**
         * 分配任务
         */
        public static String addComAccTaskUser = base_url_host + "/addComAccTaskUser";
        /**
         * 获取任务详情
         */
        public static String getComAccTaskInfo = base_url_host + "/getComAccTaskInfo";
        /**
         * 添加自定义任务
         */
        public static String addComAccTaskCustome = base_url_host + "/addComAccTaskCustome";
        /**
         * 我的任务
         */
        public static String getComAccTaskOfMe = base_url_host + "/getComAccTaskOfMe";
        /**
         * 执行人任务列表
         */
        public static String getComAccTaskUsersLists = base_url_host + "/getComAccTaskUsersLists";
        /**
         * 执行人执行任务
         */
        public static String comAccTaskExecute = base_url_host + "/comAccTaskExecute";
        /**
         * 确认任务执行人完成任务（分配人对主责人）
         */
        public static String confirmComAccTaskUser = base_url_host + "/confirmComAccTaskUser";
        /**
         * 拷贝文件
         */
        public static String copyComAccTaskUserMimes = base_url_host + "/copyComAccTaskUserMimes";
        /**
         * 获取验收计划列表
         */
        public static String getComAccPlanTaskLists = base_url_host + "/getComAccPlanTaskLists";
        /**
         * 获取可分配的楼
         */
        public static String getComAccAssignProject = base_url_host + "/getComAccAssignProject";
        /**
         * 添加验收计划
         */
        public static String addComAccPlanTask = base_url_host + "/addComAccPlanTask";
        /**
         * 编辑验收计划
         */
        public static String updateComAccPlan = base_url_host + "/updateComAccPlan";
        /**
         * 删除计划
         */
        public static String deleteComAccPlan = base_url_host + "/deleteComAccPlan";
        /**
         * 编辑管理员，管理员可执行
         */
        public static String updateComAccAuth = base_url_host + "/updateComAccAuth";
        /**
         * 获取验收任务的整改通知
         * getComAccNoticesByTaskId
         */
        public static String getComAccNoticesByTaskId = base_url_host + "/getComAccNoticesByTaskId";
        /**
         * getProjectGroupMember    ---已废弃
         * 获取项目成员（用于选择小组成员）
         */
        public static String getProjectGroupMember = base_url_host + "/getProjectGroupMember";

        /**
         * addComAccGroupMember
         * 添加小组成员
         */
        public static String addComAccGroupMember = base_url_host + "/addComAccGroupMember";
        /**
         * 获取小组人员
         */
        public static String getComAccGroupMembers = base_url_host + "/getComAccGroupMembers";
        /**
         * 获取竣工验收权限
         */
        public static String getComAccAuthorization = base_url_host + "/getComAccAuthorization";

        /**
         * getIndividualTeam
         * 获得分户小组列表
         */
        public static String getIndividualTeam = base_url_host + "/IndividualTeam";
        /**
         * getIndividualCanManagerUsers
         * 获得可以被转移管理者权限的人员列表（甲方相关一级用户）
         */
        public static String getIndividualCanManagerUsers = base_url_host + "/IndividualCanManagerUsers";
        /**
         * individualTransferTeamPrivilege
         * 转让管理者权限（管理者才可以）--分户验收
         */
        public static String individualTransferTeamPrivilege = base_url_host + "/individualTransferTeamPrivilege";
        /**
         * getIndividualAcceptanJoinUsers
         * 获得分户验收可参与人员列表（甲方公司、 已除去小组已有的成员）
         */
        public static String getIndividualAcceptanJoinUsers = base_url_host + "/IndividualAcceptanJoinUsers";
        /**
         * addIndividualTeamUsers
         * 添加小组成员
         */
        public static String addIndividualTeamUsers = base_url_host + "/addIndividualTeamUsers";
        /**
         * 获得分户验收任务列表（我分配的和执行的）
         */
        public static String getIndividualTasks = base_url_host + "/IndividualTasks";
        /**
         * 获得分户模块进入的权限
         */
        public static String getIndividualAuthorization = base_url_host + "/IndividualAuthorization";
        /**
         * getIndividualUnits
         * 获得分户单元列表
         */
        public static String getIndividualUnits = base_url_host + "/IndividualUnits";
        /**
         * getIndividualRooms
         * 获得分户房间列表(包含公共区域)
         */
        public static String getIndividualRooms = base_url_host + "/IndividualRooms";
        /**
         * getIndividualPreTasks
         * 获得预加载任务列表（某层级、包括自定义节点、自定义的任务）
         */
        public static String getIndividualPreTasks = base_url_host + "/IndividualPreTasks";
        /**
         * 获得可以被分配分户任务的人员列表
         */
        public static String getIndividualTaskCanAssignUsers = base_url_host + "/IndividualTaskCanAssignUsers";
        /**
         * 获得考勤情况-部门类型汇总表
         */
        public static String getKaoQinDeptKindCollect = base_url_host + "/kaoQinDeptKindCollect";
        /**
         * 任务详情
         */
        public static String getIndividualTaskById = base_url_host + "/IndividualTaskById";

        /**
         * addIndividualCustomNodeOrTask
         * 添加自定义节点、任务
         */
        public static String addIndividualCustomNodeOrTask = base_url_host + "/addIndividualCustomNodeOrTask";
        /**
         * 分户验收确认(反驳)任务
         */
        public static String confirmIndividualTask = base_url_host + "/confirmIndividualTask";
        /**
         * 分配任务
         */
        public static String assignIndividualTask = base_url_host + "/assignIndividualTask";
        /**
         * 参与竞标(可选择性上传监理费报价表)
         */
        public static String joinCompetitiveWithExcel = base_url_host + "/joinCompetitiveWithExcel";


        /**
         * getIvidualUnitFloors
         * 获得层
         */
        public static String getIvidualUnitFloors = base_url_host + "/getIvidualUnitFloors";
        /**
         * IndividualPublic
         * 添加房
         */
        public static String IndividualPublic = base_url_host + "/IndividualPublic";
        /**
         * addExtraTaskWithImgs
         * 新建DPM【现场交互】任务 (可上传图片)
         */
        public static String addExtraTaskWithImgs = base_url_host + "/extraTaskWithImgs";
        /**
         * 执行分户任务
         */
        public static String execuIndividualTask = base_url_host + "/execuIndividualTask";

        /**
         * getUnitTypes
         * 获取公司类型列表
         */
        public static String getUnitTypes = base_url_host + "/open/unitTypes";
        /**
         * getUserTypes
         * 获取某类型公司的职称列表
         */
        public static String getUserTypes = base_url_host + "/open/userTypes";
        /**
         * executorAssignBqqTask
         * 执行人分配子任务(仅支持item_seq=1, 最多3级任务)
         */
        public static String executorAssignBqqTask = base_url_host + "/executorAssignBqqTask";
        /**
         * updateBqqMainTaskWithImgs
         * 修改变洽签任务(未批准之前发起人可修改， 可修改图片)
         */
        public static String updateBqqMainTaskWithImgs = base_url_host + "/updateBqqMainTaskWithImgs";
        /**
         * getindividualNotices
         * 获取分户整改通知列表
         */
        public static String getindividualNotices = base_url_host + "/individualNotices";
        /**
         * getIndividualRectification
         * 添加整改通知
         */
        public static String getIndividualRectification = base_url_host + "/individualRectification";
        /**
         * 某人的任务详情(执行界面调用)
         */
        public static String getIndividualMemberTask = base_url_host + "/individualMemberTask";
        /**
         * 分户验收的模板签名
         */
        public static String acceptanceTemplate = base_url_host + "/acceptanceTemplate";

        /**
         * 执行（前期）任务
         */
        public static String execuEarlyIndividualTask = base_url_host + "/execuEarlyIndividualTask";

        /**
         * getAllPackageUnits
         * 获取项目（小区）的所有承包公司（总包+分包） (v1.0)
         */
        public static String getAllPackageUnits = base_url_host + "/allPackageUnits";
        /**
         * RectificationById
         * 整改通知详情
         */
        public static String RectificationById = base_url_host + "/RectificationById";
        /**
         * getIndividualRectificationReceive
         * 接收整改
         */
        public static String getIndividualRectificationReceive = base_url_host + "/individualRectificationReceive";
        /**
         * getIndividualRectificationReply
         * 回复整改
         */
        public static String getIndividualRectificationReply = base_url_host + "/individualRectificationReply";
        /**
         * getIndividualRectificationOutput
         * 销项整改
         */
        public static String getIndividualRectificationOutput = base_url_host + "/individualRectificationOutput";
        /**
         * 任务详情（汇总任务）
         * getIndividualSummaryById
         */
        public static String getIndividualSummaryById = base_url_host + "/IndividualSummaryById";
        /**
         * 某人的任务详情(汇总任务)
         * getIndividualSummaryTask
         */
        public static String getIndividualSummaryTask = base_url_host + "/individualSummaryTask";
        /**
         * execuSummaryTask
         * 执行（汇总）任务
         */
        public static String execuSummaryTask = base_url_host + "/execuSummaryTask";
        /**
         * 获得分户汇总表（项目）
         * getIndividualStatistics
         */
        public static String getIndividualStatistics = base_url_host + "/individualStatistics";
        /**
         * 获得分户汇总表（单体）
         * getIndividualProjectStatistics
         */
        public static String getIndividualProjectStatistics = base_url_host + "/individualProjectStatistics";
        /**
         * 获取考勤月记录（某人某月的）
         */
        public static String getAttendanceMonthRecord = base_url_host + "/attendanceMonthRecord";
        /**
         * 搜索考勤人员（管辖的）
         */
        public static String searchAttendanceUsers = base_url_host + "/searchAttendanceUsers";
        /**
         * updateGroupName
         * 修改群聊名称(群主可修改)
         */
        public static String updateGroupName = base_url_host + "/groupName";
        /**
         * 添加自定义任务
         */
        public static String addCustomTask = base_url_host + "/customTask";
        /**
         * 分配任务
         */
        public static String assignTask = base_url_host + "/assignTask";
        /**
         * 获取分配任务界面信息
         */
        public static String getAssignedTaskInfo = base_url_host + "/assignTaskInfo";
        /**
         * getBqqSeq1Task
         * 获取变洽签[建设单位各部门审核内容及费用]任务详情(item_seq=1)
         */
        public static String getBqqSeq1Task = base_url_host + "/bqqSeq1Task";
        /**
         * executeBqqSeq1Task
         * 执行[建设单位各部门审核内容及费用]任务(item_seq=1)
         */
        public static String executeBqqSeq1Task = base_url_host + "/executeBqqSeq1Task";
        /**
         * 获得任务列表（我分配的和执行的）（新列表）
         */
        public static String getTasks = base_url_host + "/getTasks";
        /**
         * 获得任务列表（我执行的）（新）
         */
        public static String getIndividualPerformTasks = base_url_host + "/IndividualPerformTasks";
        /**
         * getReport_projectowners
         * 接口用途：	获得 月报 周报 日报 列表
         */
        public static String getReport_projectowners = base_url_host + "/getReport_projectowners";
        /**
         * getDetailsReport_projectowner
         * 获取月报/周报/日报详情
         */
        public static String getDetailsReport_projectowner = base_url_host + "/detailsReport_projectowner";
        /**
         * updateReport_projectowner
         * 修改月报/周报/日报
         */
        public static String updateReport_projectowner = base_url_host + "/updateReport_projectowner";
        /**
         * 取消分配任务(未开始才可取消)
         */
        public static String cancelAssignTask = base_url_host + "/cancelAssignTask";
        /**
         * 获取可以外链的任务（同名 同属性 已分配 总监未确认） (v1.0)
         */
        public static String getCanLinkTasks = base_url_host + "/canLinkTasks";
        /**
         * 删除自定义任务 （v1.0 2015-07-23）
         */
        public static String deleteCustomTask = base_url_host + "/customTask";
        /**
         * 监理撤回已确认的任务
         */
        public static String revokeConfirmTask = base_url_host + "/revokeConfirmTask";

        /**
         * getAcceptanceRecord
         * 住宅工程质量分户验收检查记录表（汇总）
         */
        public static String getAcceptanceRecord = base_url_host + "/acceptanceRecord";
        /**
         * 总监确认任务结果
         */
        public static String managerConfirmed = base_url_host + "/managerConfirmed";
        /**
         * 确认任务资料是否齐全
         */
        public static String confirmedDoc = base_url_host + "/confirmedDoc";


        /**
         * getAcceptanceRectification
         * 住宅工程质量问题整改处置记录（汇总）
         */
        public static String getAcceptanceRectification = base_url_host + "/acceptanceRectification";
        /**
         * 获取顶级节点列表（(该楼体的)
         */
        public static String getTopCodes = base_url_host + "/topCodes";

        /**
         * 开始当前节点PUT
         */
        public static String startCurCode = base_url_host + "/startCurCode";

        /**
         * 完成当前节点&lt;除了层段以外的节点PUT
         */
        public static String finishCurCode = base_url_host + "/finishCurCode";

        /**
         * 批量分配任务(仅未分配的任务)POST
         */
        public static String assignTasks = base_url_host + "/assignTasks";

        /**
         * 批量初始化楼层、段(自定义名称)POST
         */
        public static String addFloorAndSectionBatchWithName = base_url_host + "/floorAndSectionBatchWithName";
        /**
         * getSmFileLists
         * 获取进度计划列表
         */
        public static String getSmFileLists = base_url_host + "/getSmFileLists";
        /**
         * getSmFileNode
         * 获取节点详情
         */
        public static String getSmFileNode = base_url_host + "/getSmFileNode";
        /**
         * getSmFile
         * 获取进度管理计划内容（详情）
         */
        public static String getSmFile = base_url_host + "/getSmFile";
        /**
         * shareSmFile
         * 分享计划（可选是否备份）或共享转私有
         */
        public static String shareSmFile = base_url_host + "/shareSmFile";



        /**
         * getMonthlyPriceMainTasks
         * 获取月度计价任务列表
         */
        public static String getMonthlyPriceMainTasks = base_url_host + "/getMonthlyPriceMainTasks";
        /**
         * 接口名称：	monthlyPriceManager
         * 获取模块管理者(包括审批者)
         */
        public static String monthlyPriceManager = base_url_host + "/monthlyPriceManager";
        /**
         * getMonthlyPriceAuths
         * 获取月度计价小组管理列表
         */
        public static String getMonthlyPriceAuths = base_url_host + "/monthlyPriceAuths";
        /**
         * updateMonthlyPriceManager
         * 移交小组权限
         */
        public static String updateMonthlyPriceManager = base_url_host + "/monthlyPriceManager";
        /**
         * updateMonthlyPriceAuthPost
         * 修改小组岗位人员
         */
        public static String updateMonthlyPriceAuthPost = base_url_host + "/monthlyPriceAuthPost";
        /**
         * updateMonthlyPriceApprover
         * 修改模块批准人
         */
        public static String updateMonthlyPriceApprover = base_url_host + "/monthlyPriceApprover";
        /**
         * getMonthlyPriceAuth
         * 获取小组管理详情
         */
        public static String getMonthlyPriceAuth = base_url_host + "/MonthlyPriceAuth";
        /**
         * addSmFile
         * 添加计划
         */
        public static String addSmFile = base_url_host + "/addSmFile";

        /**
         * 设置级别4节点的显示/隐藏PUT
         */
        public static String setLevel4CodeHide = base_url_host + "/setLevel4CodeHide";
        /**
         * 同步节点的显示/隐藏设置到其他段(同楼的其他段)
         */
        public static String syncCodeHide = base_url_host + "/syncCodeHide";
        /**
         * 拷贝层段到其他节点(步骤1 发起拷贝)Post
         */
        public static String copyFloorSection = base_url_host + "/copyFloorSection";

        /**
         * 拷贝层段到其他节点[步骤2 查询进度]GET
         */
        public static String copyFloorSectionProgress = base_url_host + "/copyFloorSectionProgress";

        /**
         * 批量开启层段[步骤1 发起开启]（段的status=0才可以）
         */
        public static String startSections = base_url_host + "/startSections";
        /**
         * 批量开启层段[步骤2 查询开启进度]GET
         */
        public static String startSectionsProgress = base_url_host + "/startSectionsProgress";
        /**
         * 批量添加层段[步骤2 查询进度]]GET
         */
        public static String floorAndSectionBatchWithNameProgress = base_url_host + "/floorAndSectionBatchWithNameProgress";


        /**
         * getMonthlyPriceMainTaskById
         * 获取主任务详情
         */
        public static String getMonthlyPriceMainTaskById = base_url_host + "/MonthlyPriceMainTaskById";


        /**
         * getMonthlyPriceTask
         * 获取步骤任务详情
         */
        public static String getMonthlyPriceTask = base_url_host + "/MonthlyPriceTask";


        /**
         * getMonthlyPriceTaskUser
         * 获取子任务详情
         */
        public static String getMonthlyPriceTaskUser = base_url_host + "/monthlyPriceTaskUser";


        /**
         * getMonthlyPriceTaskUsers
         * 获取子任务列表
         */
        public static String getMonthlyPriceTaskUsers = base_url_host + "/MonthlyPriceTaskUsers";

        /**
         * 接口名称：	getComAccStatistic
         * 获取竣工验收的统计报表
         */
        public static String getComAccStatistic = base_url_host + "/getComAccStatistic";
        /**
         * 接口名称：	addMonthlyPriceMainTask
         * 创建月度计价(总包常规 分包A类、 B类)(可上传图片）
         */
        public static String addMonthlyPriceMainTask = base_url_host + "/monthlyPriceMainTask";
        /**
         * getExecutorMonthlyPriceTasks
         * 获取我的执行任务列表(被分配的、待审批 )
         */
        public static String getExecutorMonthlyPriceTasks = base_url_host + "/executorMonthlyPriceTasks";
        /**
         * approveMonthlyPriceMainTask
         * 接口用途：	批准/终止任务
         */
        public static String approveMonthlyPriceMainTask = base_url_host + "/approveMonthlyPriceMainTask";
        /**
         * updateMonthlyPriceMainTaskWithImgs
         * 修改主任务(未批准之前发起人可修改)
         */
        public static String updateMonthlyPriceMainTaskWithImgs = base_url_host + "/updateMonthlyPriceMainTaskWithImgs";

        /**
         * MonthlyPriceHashistorys
         * 获取月度计价历史记录
         */
        public static String getMonthlyPriceHashistorys = base_url_host + "/MonthlyPriceHashistorys";

        /**
         * MonthlyPriceChildhistorys
         * 获取月度计价子任务历史记录
         */
        public static String getMonthlyPriceChildhistorys = base_url_host + "/MonthlyPriceChildhistorys";
        /**
         * postRejectMonthlyPriceTaskUser
         * 岗位人驳回执行人任务
         */
        public static String getPostRejectMonthlyPriceTaskUser = base_url_host + "/postRejectMonthlyPriceTaskUser";

        /**
         * postConfirmMonthlyPriceTask
         * 月度计价步骤任务完成和驳回
         */
        public static String getPostConfirmMonthlyPriceTask = base_url_host + "/postConfirmMonthlyPriceTask";

        /**
         * getExecuteMonthlyPriceTaskUser
         * 月度计价子任务完成
         */
        public static String getExecuteMonthlyPriceTaskUser = base_url_host + "/executeMonthlyPriceTaskUser";
        /**
         * updateSmFileNode
         * 进度管理节点管理（新增，删除，调整顺序）
         */
        public static String updateSmFileNode = base_url_host + "/updateSmFileNode";
        /**
         * checkMonthlyPriceTaskMimes
         * 选择或取消任务
         */
        public static String checkMonthlyPriceTaskMimes = base_url_host + "/checkMonthlyPriceTaskMimes";

        /**
         * 接口名称：	executorAssignMonthlyPriceTask
         * 执行人分配子任务
         */
        public static String executorAssignMonthlyPriceTask = base_url_host + "/executorAssignMonthlyPriceTask";
        /**
         * getAnalyzeLists--->getSmAnalyzeLists
         * 获取对比分析列表
         */
        public static String getSmAnalyzeLists = base_url_host + "/getSmAnalyzeLists";
        /**
         * updateSmFileNodePer
         * 设置节点进度，生成对比
         */
        public static String updateSmFileNodePer = base_url_host + "/updateSmFileNodePer";
        /**
         * getSmFileDescription
         * 获取计划详情
         */
        public static String getSmFileDescription = base_url_host + "/getSmFileDescription";
        /**
         * addSmTaskOfNode
         * 节点添加任务（分配）
         */
        public static String addSmTaskOfNode = base_url_host + "/addSmTaskOfNode";
        /**
         * getTipsTasks
         * 获取进入日历的任务列表
         */
        public static String getTipsTasks = base_url_host + "/tipsTasks";
        /**
         * getSmFileTask
         * 获取任务（我的和全部）
         */
        public static String getSmFileTask = base_url_host + "/getSmFileTask";
        /**
         * 接口名称：	getComAccTaskOfMeSearch
         * 我的任务中的搜索
         */
        public static String getComAccTaskOfMeSearch = base_url_host + "/getComAccTaskOfMeSearch";

        /**
         * deleteSmFileNode
         * 删除节点
         */
        public static String deleteSmFileNode = base_url_host + "/deleteSmFileNode";
        /**
         * 接口名称：	getDocGuide
         * (工程监理资料管理标准化指南)获取目录
         */
        public static String getDocGuide = base_url_host + "/getDocGuide";
        /**
         * 获得考勤情况-部门类型汇总表（某时间段）GET
         */
        public static String getKaoQinDeptKindCollectTimes = base_url_host + "/kaoQinDeptKindCollectTimes";

        /**
         * getSmTaskOfNode
         * 获取任务执行详情
         */
        public static String getSmTaskOfNode = base_url_host + "/getSmTaskOfNode";
        /**
         * excuteTask --SmExcuteTask
         * 执行任务（保存和完成）
         */
        public static String SmExcuteTask = base_url_host + "/SmExcuteTask";
        /**
         * affirmNodeTask-->SmAffirmNodeTask
         * 确认节点任务
         */
        public static String SmAffirmNodeTask = base_url_host + "/SmAffirmNodeTask";
        /**
         * getSmFileTaskSearch
         * 搜索任务
         */
        public static String getSmFileTaskSearch = base_url_host + "/getSmFileTaskSearch";

        /**
         * 获取分配任务界面信息（大实施下的）
         */
        public static String getAssignPseudoNodeTaskInfo = base_url_host + "/assignPseudoNodeTaskInfo";
        /**
         * ReportProjectownerAuthUnit
         * 添加其他公司查看权限
         */
        public static String cancelReportProjectownerAuthUnit = base_url_host + "/cancelReportProjectownerAuthUnit";
        /**
         * 接口名称：	getReportProjectownerAuthUnits
         * 查看其他公司工作报告列表
         */
        public static String getReportProjectownerAuthUnits = base_url_host + "/getReportProjectownerAuthUnits";

        /**
         * 获取我上次选择的节点
         */
        public static String getLastCheckedCode = base_url_host + "/lastCheckedCode";
        /**
         * 获取某当前节点未分配可抓取的任务列表（自执行可用，自抓取大准备/验收或抓取单任务可用）
         */
        public static String getCanGrabTasks = base_url_host + "/canGrabTasks";
        public static String getAuthUnits = base_url_host + "/getAuthUnits";
        /**
         * 接口名称：	updateComAccGroupMemberAuthority
         * 修改小组人员权限------新
         */
        public static String updateComAccGroupMemberAuthority = base_url_host + "/updateComAccGroupMemberAuthority";
        /**
         * 分配自执行任务(自执行 )POST
         */
        public static String assignSelfTask = base_url_host + "/assignSelfTask";
        /**
         * 获取自抓取的节点(自抓取-不关心段)
         */
        public static String getSelfGrabCodes = base_url_host + "/selfGrabCodes";
        /**
         * 获取自抓取的任务列表(自抓取-不关心层段-大实施)
         */
        public static String getSelfGrabTasks = base_url_host + "/selfGrabTasks";
        /**
         * 抓取多任务多段(自抓取-大实施)
         */
        public static String grapSelfTasks = base_url_host + "/grapSelfTasks";
        /**
         * 获取自抓取的任务可分配的段列表(自抓取-大实施)
         */
        public static String getSelfGrabSections = base_url_host + "/selfGrabSections";
        /**
         * 获取子节点列表(不含顶节点、末节点和任务)
         */
        public static String getChildCodesNoNode = base_url_host + "/childCodesNoNode";
        /**
         * 接口名称：	getComAccItems
         * 获取节点列表（用于创建任务选择节点）
         */
        public static String getComAccItems = base_url_host + "/getComAccItems";
        /**
         * getComAccTasksByNode
         * 获取可批量分配的任务-------新（添加节点以后的版本适用）
         */
        public static String getComAccTasksByNode = base_url_host + "/getComAccTasksByNode";

        /**
         * 开始当前节点 （子分部、工序上开启）
         */
        public static String startCurPseudoNode = base_url_host + "/startCurPseudoNode";
        /**
         * compileSmFileNode
         * 编辑节点
         */
        public static String compileSmFileNode = base_url_host + "/compileSmFileNode";
        /**
         * getAssignUser -->getSmAssignUser
         * 获取可分配的人员
         */
        public static String getSmAssignUser = base_url_host + "/getSmAssignUser";
        /**
         * getSmAnalyzeParticular
         * 获取分析详情
         */
        public static String getSmAnalyzeParticular = base_url_host + "/getSmAnalyzeParticular";
        /**
         * getSmAnalyzeTasks
         * 获取对比分析任务列表（我的、全部）
         */
        public static String getSmAnalyzeTasks = base_url_host + "/getSmAnalyzeTasks";
        /**
         * addSmFileAnalyzeTask
         * 添加对比分析任务
         */
        public static String addSmFileAnalyzeTask = base_url_host + "/addSmFileAnalyzeTask";

        /**
         * 接口名称：	outputNoticeAndSign
         * 通知销项 总监(需签名)
         */
        public static String outputNoticeAndSign = base_url_host + "/outputNoticeAndSign";
        /**
         * 接口名称：	replyNoticeAndSign
         * 通知回复 接收单位人员(需签名)
         */
        public static String replyNoticeAndSign = base_url_host + "/replyNoticeAndSign";
        /**
         * 接口名称：	addNoticeAndSign
         * 接口用途：	添加通知 （签名、生成模板）
         */
        public static String addNoticeAndSign = base_url_host + "/noticeAndSign";
        /**
         * 接口名称：	confirmNoticeAndSign
         * 接口用途：	确认通知（签收或拒绝） 总监[同意需签字]
         */
        public static String confirmNoticeAndSign = base_url_host + "/confirmNoticeAndSign";

        /**
         * 接口名称：	getNoticeDetail
         * 接口用途：	获取通知详情
         */
        public static String getNoticeDetail = base_url_host + "/noticeDetail/";
        /**
         * 接口名称：	getSccNodeName
         * 接口用途：	获取安全巡查节点列表
         */
        public static String getSccNodeName = base_url_host + "/getSccNodeName/";
        /**
         * 接口名称：	getSafetyAccNodeName
         * 接口用途：	获取安全验收节点列表
         */
        public static String getSafetyAccNodeName = base_url_host + "/getSafetyAccNodeName/";

        /**
         * addDesignManager
         * 设置管理员
         */
        public static String addDesignManager = base_url_host + "/addDesignManager";

        /**
         * updateDesignManager
         * 管理员移交
         */
        public static String updateDesignManager = base_url_host + "/updateDesignManager";

        /**
         * getDesignUnitsProjectGroup
         * 获取设计文件管理员以及项目成员
         */
        public static String getDesignUnitsProjectGroup = base_url_host + "/getDesignUnitsProjectGroup";

        /**
         * 获取项目相关的公司
         */
        public static String getAttendanceProjectGroupUnits = base_url_host + "/getAttendanceProjectGroupUnits";
        /**
         * getAttendanceApplysRecord
         * 获取申请列表
         */
        public static String getAttendanceApplysRecord = base_url_host + "/getAttendanceApplysRecord";
        /**
         * getAttendanceApplys
         * 获取申请列表
         */
        public static String getAttendanceApplys = base_url_host + "/getAttendanceApplys";
        /**
         * attendanceConfirmApply
         * 同意或者否决申请
         */
        public static String attendanceConfirmApply = base_url_host + "/attendanceConfirmApply";
        /**
         * getAttendaceUnitDepartment
         * 获取公司相关的部门
         */
        public static String getAttendaceUnitDepartment = base_url_host + "/getAttendaceUnitDepartment";

        /**
         * 获取某节点可报验的任务列表
         */
        public static String getCanInspectionTasks = base_url_host + "/canInspectionTasks";

        /**
         * 施工报验
         */
        public static String inspectTask = base_url_host + "/inspectTask";

        /**
         * 施工方获取报验任务列表(仅看自己报验的)
         */
        public static String getConstructorInspectTasks = base_url_host + "/constructorInspectTasks";

        /**
         * 获取某小区的所有楼 （按楼体类型分组）
         */
        public static String getProjectsGroupBy = base_url_host + "/projectsGroupBy";
        /**
         * 监理方获取报验任务列表(总监、工程师可见)
         */
        public static String getSupervisorInspectTasks = base_url_host + "/supervisorInspectTasks";


        /**
         * getAcceptanceCodes
         * 工程概况-验收-获取主节点列表
         */
        public static String getAcceptanceCodes = base_url_host + "/acceptanceCodes";
        /**
         * addAttendanceUnitDepartment
         * 添加公司相关的部门
         */
        public static String addAttendanceUnitDepartment = base_url_host + "/addAttendanceUnitDepartment";
        /**
         * addAttendanceApply
         * 添加查看考勤申请
         */
        public static String addAttendanceApply = base_url_host + "/addAttendanceApply";

        /**
         * updateAttendanceDepartmentOpen
         * 开启或关闭部门
         */
        public static String updateAttendanceDepartmentOpen = base_url_host + "/updateAttendanceDepartmentOpen";
        /**
         * getAttendanceUnitManager
         * 获取单位管理员
         */
        public static String getAttendanceUnitManager = base_url_host + "/getAttendanceUnitManager";

        /**
         * 添加单体批量(总监可以 type=101/110的单体仅能创建一个)
         */
        public static String addProjects = base_url_host + "/projects";

        /**
         * updateAttendanceCompanyManager
         * 公司管理员权限移交
         */
        public static String updateAttendanceCompanyManager = base_url_host + "/updateAttendanceCompanyManager";
        /**
         * 接口名称：	recheckNoticeAndSign
         * 通知复检 工程师 发起人可执行(需签名)
         */
        public static String recheckNoticeAndSign = base_url_host + "/recheckNoticeAndSign";
        /**
         * 设置工程（楼）的总包单位
         */
        public static String updateProjectUnit = base_url_host + "/projectUnit";
        /**
         * 完成段
         */
        public static String finishSection = base_url_host + "/finishSection";
        /**
         * 完成层
         */
        public static String finishFloor = base_url_host + "/finishFloor";
        /**
         * 删除层/区（已分配任务则不可删除）DELETE
         */
        public static String deleteFloor = base_url_host + "/floor";
        /**
         * 删除段（已分配任务则不可删除）DELETEsection_id
         */
        public static String deleteSection = base_url_host + "/section";
        /**
         * 修改楼层名称PUT
         */
        public static String updateFloorName = base_url_host + "/floorName";
        /**
         * 修改段名称PUT
         */
        public static String updateSectionName = base_url_host + "/sectionName";
        /**
         * deleteSmFile
         * 删除计划
         */
        public static String deleteSmFile = base_url_host + "/deleteSmFile";
        /**
         * 获取某资料的任务文件列表 (已确认完成的）
         */
        public static String taskFilesOfDoc = base_url_host + "/taskFilesOfDoc";
        /**
         * 工程师用户获取的任务列表 (工程师任务列表界面 或 总监自安排任务列表界面)
         */
        public static String getEngineerSelfTaskList = base_url_host + "/engineerSelfTasks";
        /**
         * addTaskNoticeAndSign
         * 添加任务通知并签名(关联到任务)
         */
        public static String addTaskNoticeAndSign = base_url_host + "/taskNoticeAndSign";
        /**
         * 计划删除历史
         * deleteSmFileHistory
         */
        public static String deleteSmFileHistory = base_url_host + "/deleteSmFileHistory";
        /**
         * getAttendanceUnitDepartments
         * 返回单位所有部门(部门列表)
         */
        public static String getAttendaceUnitDepartments = base_url_host + "/getAttendaceUnitDepartments";
        /**
         * updateSmFile
         * 更新计划
         */
        public static String updateSmFile = base_url_host + "/updateSmFile";
        /**
         * 添加大事记
         */
        public static String addEvent = base_url_host + "/event_new";
        /**
         * 获取用户的待办事项数量(整个项目的)
         */
        public static String getPgBacklogCount = base_url_host + "/pgBacklogCount";
        /**
         * 获取通知的归档文件(model N开头的)
         */
        public static String getNoticeArchives = base_url_host + "/noticeArchives";
        /**
         * 获取监理互联待办事项数量
         */
        public static String getJlhlBacklogCount = base_url_host + "/jlhlBacklogCount";
        /**
         * updateSmNodeOrder
         * 更改节点顺序
         */
        public static String updateSmNodeOrder = base_url_host + "/updateSmNodeOrder";
        /**
         * 获取会议的归档文件(model M开头的)
         */
        public static String getMeetingArchives = base_url_host + "/meetingArchives";

        /**
         * 获取施工报验代办事项数量
         */
        public static String getInspectBacklogCount = base_url_host + "/inspectBacklogCount";
        /**
         * updateHouseDeliveryTeamAuthority
         * 修改小组人员权限
         */
        public static String updateHouseDeliveryTeamAuthority = base_url_host + "/updateHouseDeliveryTeamAuthority";
        /**
         * updateIndividualTeamAuthority
         * 修改小组人员权限（新）
         */
        public static String updateIndividualTeamAuthority = base_url_host + "/updateIndividualTeamAuthority";
        /**
         * scanLogin
         * 扫描登陆
         */
        public static String scanLogin = base_url_host + "/scanLogin";
        /**
         *
         */
        /**
         * 获取会审列表===新(2017-02-27)
         */
        public static String getDesignJhLists = base_url_host + "/getDesignJhLists";
        /**
         * 获取设计文件-变更-变洽签归档列表
         */
        public static String getDesignBqqChanges = base_url_host + "/designBqqChanges";
        /**
         * 创建变更
         */
        public static String addDesignChange = base_url_host + "/addDesignChange";
        /**
         * 创建会审
         */
        public static String addDesignJh = base_url_host + "/addDesignJh";
        /**
         * 获取会审详情===新(2017-02-27)
         */
        public static String getDesignJhDetail = base_url_host + "/getDesignJhDetail";
        /**
         * 获取设计文件-变更-变洽签归档详情 任务资料
         */
        public static String getDesignBqqChange = base_url_host + "/designBqqChange";
        /**
         * 上传变更文件
         */
        public static String addDesignChengeFile = base_url_host + "/addDesignChengeFile";
        /**
         * 上传会审文件
         */
        public static String addDesignJhFile = base_url_host + "/addDesignJhFile";
        /**
         * getSmBBSLists
         * 获取帖子列表
         */
        public static String getSmBBSLists = base_url_host + "/getSmBBSLists";
        /**
         * addSmBBS
         */
        public static String addSmBBS = base_url_host + "/addSmBBS";
        /**
         * getSmBBSDetails
         * 获取帖子详情
         */
        public static String getSmBBSDetails = base_url_host + "/getSmBBSDetails";
        /**
         * getSmBBSReplyLists
         * 获取帖子的回复贴列表
         */
        public static String getSmBBSReplyLists = base_url_host + "/getSmBBSReplyLists";
        /**
         * addSmBBSReply
         * 添加帖子回复贴
         */
        public static String addSmBBSReply = base_url_host + "/addSmBBSReply";
        /**
         * 接口名称：	addMeetingRoom
         * 添加会议室
         */
        public static String addMeetingRoom = base_url_host + "/meetingRoom";
        /**
         * getMeetingRooms
         * 获取会议室列表(off,room_name排序)
         */
        public static String getMeetingRooms = base_url_host + "/meetingRooms";
        /**
         * 接口名称：	getMeetingRoom
         * 获取会议室详情
         */
        public static String getMeetingRoom = base_url_host + "/meetingRoom";
        /**
         * 接口名称：	addMeetingWithRoom
         * 新建会议[可选会议室]
         */
        public static String addMeetingWithRoom = base_url_host + "/meetingWithRoom";
        /**
         * 接口名称：	getFreeRoomsOfDay
         * 接口用途：	获取某日可用的会议室列表（时间段、时长查询）
         */
        public static String getFreeRoomsOfDay = base_url_host + "/freeRoomsOfDay";
        /**
         * getFreesOfRoom
         * 获取会议室某天的空闲时间段
         */
        public static String getFreesOfRoom = base_url_host + "/freesOfRoom";
        /**
         * inviteAttendMeeting
         * 邀请他人加入会议（会议未开始 参会人员可邀请未参会人员）
         */
        public static String inviteAttendMeeting = base_url_host + "/inviteAttendMeeting";
        /**
         * 接口名称：	getMeetingsOfRoom
         * 获取会议室某天已预约的会议列表(也可获取历史某天的)
         */
        public static String getMeetingsOfRoom = base_url_host + "/meetingsOfRoom";
        /**
         * updateMeetingRoom
         * 修改会议室
         */
        public static String updateMeetingRoom = base_url_host + "/meetingRoom";
        /**
         * getSmBBSReplyDatail
         * 获取回复贴详情
         */
        public static String getSmBBSReplyDatail = base_url_host + "/getSmBBSReplyDatail";
        /**
         * getSmBBSReplyReplyLists
         * 获取回复贴的评论列表
         */
        public static String getSmBBSReplyReplyLists = base_url_host + "/getSmBBSReplyReplyLists";
        /**
         * deleteSmBBS
         * 删除帖子或评论
         */
        public static String deleteSmBBS = base_url_host + "/deleteSmBBS";
        /**
         * addSmBBSPraise
         * 为帖子点赞或取消
         */
        public static String addSmBBSPraise = base_url_host + "/addSmBBSPraise";
        /**
         * getSmBBSOfMe
         * 获取我发表的、收藏的、浏览的
         */
        public static String getSmBBSOfMe = base_url_host + "/getSmBBSOfMe";
        /**
         * getSmBBSReplyToMe
         * 获取回复我的评论和我回复的
         */
        public static String getSmBBSReplyToMe = base_url_host + "/getSmBBSReplyToMe";
        /**
         * addSmBBSCollection
         * 添加收藏或取消收藏
         */
        public static String addSmBBSCollection = base_url_host + "/addSmBBSCollection";
        /**
         * searchSmFile
         * 搜索计划
         */
        public static String searchSmFile = base_url_host + "/searchSmFile";
        /**
         * searchSmNode
         * 搜索节点
         */
        public static String searchSmNode = base_url_host + "/searchSmNode";
        /**
         * searchSmBBS
         * 搜索帖子
         */
        public static String searchSmBBS = base_url_host + "/searchSmBBS";
        /**
         * confirmExtraNoticeAndSign
         * 确认通知管理（签收或拒绝） 负责人[同意需签字]
         */
        public static String confirmExtraNoticeAndSign = base_url_host + "/confirmExtraNoticeAndSign";
        /**
         * outputExtraNoticeAndSign
         * 通知管理销项 负责人/发起人(需签名)
         */
        public static String outputExtraNoticeAndSign = base_url_host + "/outputExtraNoticeAndSign";
        /**
         * recheckExtraNoticeAndSign
         * 通知管理复检 工程师发起人可执行(需签名)
         */
        public static String recheckExtraNoticeAndSign = base_url_host + "/recheckExtraNoticeAndSign";
        /**
         * replyExtraNoticeAndSign
         * 通知管理回复 接收单位人员(需签名)
         */
        public static String replyExtraNoticeAndSign = base_url_host + "/replyExtraNoticeAndSign";
        /**
         * addExtraNoticeAndSign
         * 新建通知管理并签名
         */
        public static String addExtraNoticeAndSign = base_url_host + "/extraNoticeAndSign";
        /**
         * 接口名称：	getExtraNoticeDetail
         * 获取通知管理详情
         */
        public static String getExtraNoticeDetail = base_url_host + "/extraNoticeDetail/";
        /**
         * 接口名称：	getMeeting
         * 接口用途：	获取会议详情
         */
        public static String getMeeting = base_url_host + "/meeting";
        /**
         * 接口名称：	getMeetingInviter
         * 接口用途：	获取会议邀请详情
         */
        public static String getMeetingInviters = base_url_host + "/meetingInviters";


        /**
         * 取消报验(未确认的才可取消 报验人取消)
         */
        public static String cancelInspectTask = base_url_host + "/cancelInspectTask";
        /**
         * 更新极光推送registrationID (设置别名Alias成功后调用)
         */
        public static String updateUserJPushId = base_url_host + "/open/userJPushId";


        /**
         * 获取 实测实量 户 图纸列表
         */
        public static String getActualMeasureDrawings = base_url_host + "/getActualMeasureDrawings";

        /**
         * 添加实测实量 图纸 （从设计文件 获取添加）
         */
        public static String uploadActualMeasureDrawing = base_url_host + "/uploadActualMeasureDrawing";
        /**
         * 标记挂接任务
         */
        public static String actualMeasureTagTasks = base_url_host + "/actualMeasureTagTasks";

        /**
         * getDesignMark
         * 获取 文件标记
         */
        public static String getDesignMark = base_url_host + "/getDesignMark";


        /**
         * 图纸拷贝
         */
        public static String copyDrawing = base_url_host + "/copyDrawing";
        /**
         * 分配任务
         */
        public static String markTaskDistribution = base_url_host + "/markTaskDistribution";
        /**
         * drawingMarkTasks
         * 获取标记挂接任务列表
         */
        public static String drawingMarkTasks = base_url_host + "/drawingMarkTasks";
        /**
         * markTaskNodes
         * 获取 标记任务 节点 列表
         */
        public static String markTaskNodes = base_url_host + "/markTaskNodes";
        /**
         * markTasks
         * 获取 标记任务 节点 列表
         */
        public static String markTasks = base_url_host + "/markTasks";
        /**
         * getActualMeasureDrawingMarks
         * getActualMeasureDrawingMarks
         */
        public static String getActualMeasureDrawingMarks = base_url_host + "/getActualMeasureDrawingMarks";
        /**
         * actualMeasureDrawingMarkAdd
         * 更新 实测实量 图纸文件 标记信息
         */
        public static String actualMeasureDrawingMarkAdd = base_url_host + "/actualMeasureDrawingMarkAdd";
        /**
         * getInspect
         * 获取报验详情
         */
        public static String getInspect = base_url_host + "/inspect";
        /**
         * getCanAddInspectTemplates
         * 获取可添加的报验模板列表
         */
        public static String getCanAddInspectTemplates = base_url_host + "/canAddInspectTemplates";
        /**
         * 接口名称：	getInspectTemplateSigns
         * 获取报验模板签名情况
         */
        public static String getInspectTemplateSigns = base_url_host + "/inspectTemplateSigns";
        /**
         * 接口名称：	signInspectTemplate
         * 报验模板-签名
         */
        public static String signInspectTemplate = base_url_host + "/signInspectTemplate";



        /**
         *保存/修改报验模板数据(V2.支持重复添加报验模板)
         */
        public static String saveInspectTemplateV2 = base_url_host + "/v2/saveInspectTemplate";

        /**
         * 获取图纸列表——管理用图(节点树)
         */
        public static String getCodeDesigns = base_url_host + "/codeDesigns";
        /**
         * 获取图纸列表——施工图(专业)
         */
        public static String getContractDesigns = base_url_host + "/contractDesigns";


        /**
         * extraMarkAdd
         * 现场交互 标记更新
         */
        public static String extraMarkAdd = base_url_host + "/extraMarkAdd";
        /**
         * getExtraMarks
         * 获取 标记列表
         */
        public static String getExtraMarks = base_url_host + "/getExtraMarks";
        /**
         * getMarkTasks
         * 根据标记 获取 任务列表
         */
        public static String getMarkTasks = base_url_host + "/getMarkTasks";
        /**
         * 修改日志（未审阅可修改）
         */
        public static String updateUserOrSupervosionLog = base_url_host + "/updateUserOrSupervosionLog";
        /**
         * 获取日志详情
         */
        public static String getUserLogDetail = base_url_host + "/getUserLogDetail";
        /**
         * partyInfoType
         * 获取 资讯 类别
         */
        public static String partyInfoType = base_url_host + "/partyInfoType";
        /**
         * getpartyInfos
         * 获取 资讯 列表
         */
        public static String getpartyInfos = base_url_host + "/getpartyInfos";
        /**
         * getUnitUser
         * 获取 添加人员列表
         */
        public static String getUnitUser = base_url_host + "/getUnitUser";
        /**
         * partyMemberAdd
         * 添加 党员
         */
        public static String partyMemberAdd = base_url_host + "/partyMemberAdd";
        /**
         * getPartyAuth
         * 获取 党建 权限
         */
        public static String getPartyAuth = base_url_host + "/getPartyAuth";
        /**
         * getpartyInfo
         * 获取 资讯 详情
         */
        public static String getpartyInfo = base_url_host + "/getpartyInfo";
        /**
         * grapActualMeasureTasks
         * 实测实量 任务 抓取(新的旧的markTaskDistribution已经废弃)
         */
        public static String grapActualMeasureTasks = base_url_host + "/grapActualMeasureTasks";
        /**
         * getPartyMembers
         * 获取党员列表
         */
        public static String getPartyMembers = base_url_host + "/getPartyMembers";
        /**
         * partyMemberDel
         * 删除党员
         */
        public static String partyMemberDel = base_url_host + "/partyMemberDel";
        /**
         * partyMemberLevelPut
         * 修改 党员权限
         */
        public static String partyMemberLevelPut = base_url_host + "/partyMemberLevelPut";

        /**
         * getPartyLearnings
         * 获取 学习 列表
         */
        public static String getPartyLearnings = base_url_host + "/getPartyLearnings";
        /**
         * 添加 通知
         */
        public static String partyNoticeAdd = base_url_host + "/partyNoticeAdd";
        /**
         * 获取 通知列表
         */
        public static String getPartyNotices = base_url_host + "/getPartyNotices";
        /**
         * 获取 通知详情
         */
        public static String getPartyNotice = base_url_host + "/getPartyNotice";
        /**
         * 党建  通知详情 确认通知
         */
        public static String confirmNoticeDetail = base_url_host + "/confirmNotice";
        /**
         * 获取 通知 人员列表
         */
        public static String getPartyNoticeUsers = base_url_host + "/getPartyNoticeUsers";
        /**
         * 通知 删除
         */
        public static String partyNoticeDel = base_url_host + "/partyNoticeDel";
        /**
         * getMarkModule
         * 获取标记 相关的 模块
         */
        public static String getMarkModule = base_url_host + "/getMarkModule";
        /**
         * getMarks
         * 获取标注
         */
        public static String getMarks = base_url_host + "/getMarks";
        /**
         * markAdd
         * 添加标记
         */
        public static String markAdd = base_url_host + "/markAdd";
        /**
         * 接口名称：	getActualMeasureStatics
         * 接口用途：	获取实测实量Html报表（某楼/单元/层/户 检查项目/检测项 网页形式）
         * method：	GET
         * 接口地址：	/actualMeasureStatics
         */
        public static String getActualMeasureStatics = base_url_host + "/open/actualMeasureStatics";
        /**
         * 接口名称：	getHouseFloors
         * 接口用途：	获取某单元的层列表（仅返回id,名称）
         * method：	GET
         * 接口地址：	/open/houseFloors/{house_delivery_unit_id}
         */
        public static String getHouseFloors = base_url_host + "/open/houseFloors";
        /**
         * 接口名称：	getHouseUnits
         * 接口用途：	获取某单体的单元列表
         * method：	GET
         * 接口地址：	/open/houseUnits/{project_id}
         */
        public static String getHouseUnits = base_url_host + "/open/houseUnits";
        /**
         * 接口名称：	getHouseRooms
         * 接口用途：	获取某层的户列表（仅返回id,名称）
         * method：	GET
         * 接口地址：	/open/houseRooms/{house_delivery_floor_id}
         */
        public static String getHouseRooms = base_url_host + "/open/houseRooms";
        /**
         * 接口名称：	getExtraNoticeLogs
         * 接口用途：	获取通知管理报告
         * method：	GET
         * 接口地址：	/open/extraNoticeLogs
         */
        public static String getExtraNoticeLogs = base_url_host + "/open/extraNoticeLogs";
        /**
         * 接口名称：	getExtraNoticeStatics
         * 接口用途：	获取通知管理统计报告(通知数量)
         * method：	GET
         * 接口地址：	/open/extraNoticeStatics
         */
        public static String getExtraNoticeStatics = base_url_host + "/open/extraNoticeStatics";

        /**
         * 添加施工报验自定义任务（施工方可添加）
         */
        public static String addCustomInspectTask = base_url_host + "/customInspectTask";
        /**
         * 监理方发起施工报验（转到待报验）
         */
        public static String supervisorInspectTask = base_url_host + "/supervisorInspectTask";
        /**
         * markMimeUpload
         * 标记上传文件
         */
        public static String markMimeUpload = base_url_host + "/markMimeUpload";
        /**
         * getMarkMimes
         * 获取标记下的 文件列表
         */
        public static String getMarkMimes = base_url_host + "/getMarkMimes";
        /**
         * 获取报验模板初始化信息（项目名称、总包等）
         */
        public static String getInspectTemplateInitInfo = base_url_host + "/inspectTemplateInitInfo";
        /**
         * 获得亚投行考勤成员列表
         */
        public static String getYthMembers = base_url_host + "/ythMembers";
        /**
         * 获取亚投行总包考勤人数统计列表（某日）
         */
        public static String getYthAttendanceCounts = base_url_host + "/ythAttendanceCounts";
        /**
         * 获取亚投行某总包下的分包公司考勤人数统计列表（某日）
         */
        public static String getYthAttendanceSubCounts = base_url_host + "/ythAttendanceSubCounts";
        /**
         * 修改亚投行考勤普通管理员（超级管理员可操作）
         */
        public static String updateYthManager = base_url_host + "/ythManager";
        /**
         * 添加亚投行考勤查看人（管理员可操作）
         */
        public static String addYthMembers = base_url_host + "/ythMembers";
        /**
         * 删除亚投行考勤查看人（管理员可操作）
         */
        public static String deleteYthMembers = base_url_host + "/ythMembers";
        /**
         * singleMarkAdd
         * 单独添加标记
         */
        public static String singleMarkAdd = base_url_host + "/singleMarkAdd";
        /**
         * getBLTaskCount
         * 获取待办事项的数量
         */
        public static String getBLTaskCount = base_url_host + "/getBLTaskCount";
        /**
         * getBLBYTaskLists
         * 获取报验待办任务列表
         */
        public static String getBLBYTaskLists = base_url_host + "/getBLBYTaskLists";
        /**
         * getBLJLTaskLists
         * 获取监理待办任务列表
         */
        public static String getBLJLTaskLists = base_url_host + "/getBLJLTaskLists";
        /**
         * getBLHYTaskLists
         * 获取会议待办任务列表
         */
        public static String getBLHYTaskLists = base_url_host + "/getBLHYTaskLists";
        /**
         * getBLTZTaskLists
         * 获取通知待办任务列表
         */
        public static String getBLTZTaskLists = base_url_host + "/getBLTZTaskLists";
        /**
         * getBLSupBYTaskLists
         * 获取监理方报验待办任务列表
         */
        public static String getBLSupBYTaskLists = base_url_host + "/getBLSupBYTaskLists";
        /**
         * getBLConBYTaskLists
         * 获取施工方报验待办任务列表
         */
        public static String getBLConBYTaskLists = base_url_host + "/getBLConBYTaskLists";
        /**
         * getBLJLTaskListsForMaj
         * 获取监理总监待办任务列表
         */
        public static String getBLJLTaskListsForMaj = base_url_host + "/getBLJLTaskListsForMaj";
        /**
         * getBLJLTaskListsForEng
         * 获取监理工程师待办任务列表
         */
        public static String getBLJLTaskListsForEng = base_url_host + "/getBLJLTaskListsForEng";
        /**
         * getTaskMimesByFile
         * 根据文件获取任务下所有文件
         */
        public static String getTaskMimesByFile = base_url_host + "/getTaskMimesByFile";
        /**
         * getNoticeMimesByFile
         * 根据文件获取同一任务下的所有文件
         */
        public static String getNoticeMimesByFile = base_url_host + "/getNoticeMimesByFile";
        /**
         * getMeetingMimesByFile
         * 获取根据文件获取会议下所有文件
         */
        public static String getMeetingMimesByFile = base_url_host + "/getMeetingMimesByFile";

        /**
         * 设置节点的分包单位(1/3级可设定 多个单位，3级从1级已选择的分包公司中选择)PUT
         */
        public static String updateCodeUnits = base_url_host + "/codeUnits";

        /**
         * 获取节点选中的分包单位列表(1/3级才有)
         */
        public static String getCodeUnits = base_url_host + "/codeUnits";

        /**
         * 监理互联 任务关节图纸
         */
        public static String engineerAddmime = base_url_host + "/engineerAddmime";
        /**
         * singleMarkPut
         * 单独修改标记
         */
        public static String singleMarkPut = base_url_host + "/singleMarkPut";
        /**
         * singleMarkDel
         * 单个标记删除
         */
        public static String singleMarkDel = base_url_host + "/singleMarkDel";
        /**
         * getMarkNotices
         * 获取通知标记列表
         */
        public static String getMarkNotices = base_url_host + "/getMarkNotices";

        /**
         * 获取实测实量任务的布点图列表
         * 标记上传文件
         */
        public static String getActualDistributionMaps = base_url_host + "/actualDistributionMaps";
        /**
         * getSmFileTaskCount
         * 获取任务各个状态的数量
         */
        public static String getSmFileTaskCount = base_url_host + "/getSmFileTaskCount";
        /**
         * getSmartInfo
         * 获取智慧工地配置信息
         */
        public static String getSmartInfo = base_url_host + "/smartInfo";
        /**
         * getUnitByProjectGroup
         * 获取项目下某类型的单位
         */
        public static String getUnitByProjectGroup = base_url_host + "/getUnitByProjectGroup";
        /**
         * getUnitPayFiles
         * 获取详情及文件
         */
        public static String getUnitPayFiles = base_url_host + "/getUnitPayFiles";
        /**
         * singleActualMeasureMarkAdd
         * 实测实量单个标记 添加
         */
        public static String singleActualMeasureMarkAdd = base_url_host + "/singleActualMeasureMarkAdd";
        /**
         * singleActualMeasureMarkPut
         * 实测实量 单个标记修改
         */
        public static String singleActualMeasureMarkPut = base_url_host + "/singleActualMeasureMarkPut";
        /**
         * singleActualMeasureMarkDel
         * 实测实量单个标记删除
         */
        public static String singleActualMeasureMarkDel = base_url_host + "/singleActualMeasureMarkDel";
        /**
         * getBLSCSLTaskLists
         * 获取实测实量待办任务列表
         */
        public static String getBLSCSLTaskLists = base_url_host + "/getBLSCSLTaskLists";
        /**
         * getUnitPayLists
         * 获取民工工资列表
         */
        public static String getUnitPayLists = base_url_host + "/getUnitPayLists";
        /**
         * 获取实测实量列表数量（分配/执行/全部）
         */
        public static String getActualBacklogCount = base_url_host + "/actualBacklogCount";
        /**
         * isCreateRewordOrder
         * 是否可生成订单
         */
        public static String isCreateRewordOrder = base_url_host + "/isCreateRewordOrder";
        /**
         * createRewordOrder
         * 创建并返回订单
         */
        public static String createRewordOrder = base_url_host + "/createRewordOrder";
        /**
         * 修改项目详情
         */
        public static String updateProjectGroupInfo = base_url_host + "/updateProjectGroupInfo";
        /**
         * getHazardSources
         * 获取智慧工地-危险源列表
         */
        public static String getHazardSources = base_url_host + "/smart/hazardSources";
        /**
         * getSmartDevices
         * 获取智慧工地-设备列表
         */
        public static String getSmartDevices = base_url_host + "/smartDevices";
        /**
         * getEnvironmentInfo
         * 获取智慧工地环境监测信息
         */
        public static String getEnvironmentInfo = base_url_host + "/environment/info";

        /**
         * getRewordOrderLists
         * 获取订单列表(创建时间倒序)
         */
        public static String getRewordOrderLists = base_url_host + "/getRewordOrderLists";
        /**
         * getRewordOrder
         * 获取订单详情
         */
        public static String getRewordOrder = base_url_host + "/rewordOrder";
        /**
         * getRewordAlipayOrder
         * 获取订单的订单请求参数（已创建未支付时重新支付使用）
         */
        public static String getRewordAlipayOrder = base_url_host + "/rewordAlipayOrder";
        /**
         * getActualMeasureMarkMimes
         * 实测实量获取标记下的文件列表
         */
        public static String getActualMeasureMarkMimes = base_url_host + "/getActualMeasureMarkMimes";
        /**
         * actualMeasureMarkMimeUpload
         * 实测实量标记上传文件
         */
        public static String actualMeasureMarkMimeUpload = base_url_host + "/actualMeasureMarkMimeUpload";
        /**
         * getAppConstStatics
         * 获取前期工作进度统计表
         */
        public static String getAppConstStatics = base_url_host + "/open/appConstStatics";

        /**
         * 查询人员轨迹列表(某天)level=1/2看所有， 其他仅看自己
         */
        public static String getPaths = base_url_host + "/paths";

        /**
         * 添加轨迹 监理/总监可添加
         */
        public static String addPath = base_url_host + "/addPath";

        /**
         * 初始化楼层/添加楼层、设置段（---------仅不分层段时使用----------）
         */
        public static String addFloorAndSection = base_url_host + "/floorAndSection";
        /**
         * getBLFHTaskLists
         * 获取分户验收待办任务列表
         */
        public static String getBLFHTaskLists = base_url_host + "/getBLFHTaskLists";
        /**
         * getBLJGTaskLists
         * 获取竣验收待办任务列表
         */
        public static String getBLJGTaskLists = base_url_host + "/getBLJGTaskLists";

        /**
         * 获取领导界面首页党建、政策要闻信息
         */
        public static String getLeaderPartyPolicy = base_url_host + "/leaderPartyPolicy";


        /**
         * 获取政策要闻列表
         */
        public static String getPolicyNewsLists = base_url_host + "/getPolicyNewsLists";


        /**
         * 获取关键工序节点列表(领导界面)
         */
        public static String getSmImplortFile = base_url_host + "/getSmImplortFile";

        /**
         * 获取某用户当前选择的项目信息（包含当前项目 楼、节点）（v1.0）
         */
        public static String getCurProjectGroup = base_url_host + "/curProjectGroup";

        /**
         * 修改当前选择的项目 PUT
         */
        public static String updateCurPgChecked = base_url_host + "/curPgChecked";

        /**
         * getComAccTaskListsOfMe
         * 获取我的任务
         */
        public static String getComAccTaskListsOfMe = base_url_host + "/getComAccTaskListsOfMe";


        /**
         * 获取会议统计
         */
        public static String getMeetingStatistics = base_url_host + "/meetingStatistics";

        /**
         * getComAccTaskByTaskName
         * 根据任务名称获取任务列表
         */
        public static String getComAccTaskByTaskName = base_url_host + "/getComAccTaskByTaskName";
        /**
         * finishIndividualRoom
         * 完成房
         */
        public static String finishIndividualRoom = base_url_host + "/finishIndividualRoom";
        /**
         * updateHouseDeliveryUnitMime
         * 交房某单元图纸挂接
         */
        public static String updateHouseDeliveryUnitMime = base_url_host+"/updateHouseDeliveryUnitMime";
        /**
         * updateHouseDeliveryFloorMime
         * 交房某单元图纸挂接
         */
        public static String updateHouseDeliveryFloorMime = base_url_host+"/updateHouseDeliveryFloorMime";
        /**
         * getUnitORFloormimes
         * 获取单元或层的图纸挂接
         */
        public static String getUnitORFloormimes = base_url_host+"/getUnitORFloormimes";
        /**
         * getSpeWorkUsers
         * 获取特种作业人员列表
         */
        public static String getSpeWorkUsers = base_url_host+"/jintai/getSpeWorkUsers";
        /**
         * addSpeWorkUser
         * 添加特种作业人员
         */
        public static String addSpeWorkUser = base_url_host+"/jintai/addSpeWorkUser";
        /**
         * getSpeWorkDetails
         * 获取特种人员详情
         */
        public static String getSpeWorkDetails = base_url_host+"/jintai/getSpeWorkDetails";
        /**
         * updateSpeWorkUserInfo
         * 更新特种作业人员信息
         */
        public static String updateSpeWorkUserInfo = base_url_host+"/jintai/updateSpeWorkUserInfo";
        /**
         * getEquipments
         * 获取城市公司的特种设备列表
         */
        public static String getEquipments = base_url_host+"/jintai/equipments";
        /**
         * addEquipment
         * 添加特种设备(城市公司人员可操作)
         */
        public static String addEquipment = base_url_host+"/jintai/equipment";
        /**
         * getEquipment
         * 获取特种设备详情
         */
        public static String getEquipment = base_url_host+"/jintai/equipment";
        /**
         * updateEquipmentValidityPeriod
         * 重置特种设备保养有效期(同公司人员可操作)
         */
        public static String updateEquipmentValidityPeriod = base_url_host+"/jintai/equipmentValidityPeriod";
        /**
         * getMyConstrctionUnits
         * 获取我相关的建设公司列表（集团、城市、项目）
         */
        public static String getMyConstrctionUnits = base_url_host+"/myConstrctionUnits";
        /**
         * getPlotFolders
         * 获取质量策划目录列表
         */
        public static String getPlotFolders = base_url_host+"/jintai/plotFolders";
        /**
         * getPlotFiles
         * 质量策划-获取文件列表
         */
        public static String getPlotFiles = base_url_host+"/jintai/plotFiles";
        /**
         * getJtPatrolLists
         * 获取质量检查任务列表
         */
        public static String getJtPatrolLists = base_url_host+"/jintai/getJtPatrolLists";
        /**
         * addJtPatrol
         * 添加质量检查
         */
        public static String addJtPatrol = base_url_host+"/jintai/addJtPatrol";
        /**
         * getHazardsLists
         * 获取危险源列表
         */
        public static String getHazardsLists = base_url_host+"/jintai/getHazardsLists";
        /**
         * getHazardsManageLists
         * 获取安全危险源、环境因素管理列表
         */
        public static String getHazardsManageLists = base_url_host+"/jintai/getHazardsManageLists";
        /**
         * getHazardsTypeLists
         * 获取风险类别
         */
        public static String getHazardsTypeLists = base_url_host+"/jintai/getHazardsTypeLists";
        /**
         * addHazards
         * 	添加安全危险源、环境因素管理
         */
        public static String addHazards = base_url_host+"/jintai/addHazards";
        /**
         * getHazardsRecently
         * 	获取本单位最近一次的辨识
         */
        public static String getHazardsRecently = base_url_host+"/jintai/getHazardsRecently";
        /**
         * getHazardsManageDetails
         * 		获取辨识、评价详情
         */
        public static String getHazardsManageDetails = base_url_host+"/jintai/getHazardsManageDetails";
        /**
         * getQualityEducationFolders
         * 质量教育培训-获取目录列表
         */
        public static String getQualityEducationFolders = base_url_host+"/jintai/qualityEducationFolders";
        /**
         * 	getQualityEducationFiles
         * 	质量教育培训-获取文件列表
         */
        public static String getQualityEducationFiles = base_url_host+"/jintai/qualityEducationFiles";
        /**
         * getSafetyEducationFolders
         * 	安全教育培训-获取目录列表
         */
        public static String getSafetyEducationFolders = base_url_host+"/jintai/safetyEducationFolders";
        /**
         * 	getSafetyEducationFiles
         * 	安全教育培训-获取文件列表
         */
        public static String getSafetyEducationFiles = base_url_host+"/jintai/safetyEducationFiles";
        /**
         * 质量保证体系
         * 	getQualityAssuranceFolders
         */
        public static String getQualityAssuranceFolders = base_url_host+"/jintai/qualityAssuranceFolders";
        /**
         * 	getQualityAssuranceFiles
         * 	质量保证体系
         */
        public static String getQualityAssuranceFiles = base_url_host+"/jintai/qualityAssuranceFiles";
        /**
         * getQualityInterestFolders
         * 质量相关方-获取目录列表
         */
        public static String getQualityInterestFolders = base_url_host+"/jintai/qualityInterestFolders";
        /**
         * getQualityInterestFiles
         * 质量相关方-获取文件列表
         */
        public static String getQualityInterestFiles = base_url_host+"/jintai/qualityInterestFiles";
        /**
         * getSafetyInterestFolders
         * 安全相关方-获取目录列表
         */
        public static String getSafetyInterestFolders = base_url_host+"/jintai/safetyInterestFolders";
        /**
         * getSafetyInterestFiles
         * 安全相关方-获取文件列表
         */
        public static String getSafetyInterestFiles = base_url_host+"/jintai/safetyInterestFiles";
        /**
         * getSafetyOrgFolders
         * 安全组织机构管理-获取目录列表
         */
        public static String getSafetyOrgFolders = base_url_host+"/jintai/safetyOrgFolders";
        /**
         * getSafetyOrgFiles
         * 安全组织机构管理-获取文件列表
         */
        public static String getSafetyOrgFiles = base_url_host+"/jintai/safetyOrgFiles";
        /**
         * 	getSafetyRegulationFolders
         * 安全规章制度-获取目录列表
         */
        public static String getSafetyRegulationFolders = base_url_host+"/jintai/safetyRegulationFolders";
        /**
         * getSafetyRegulationFiles
         * 安全规章制度-获取文件列表
         */
        public static String getSafetyRegulationFiles = base_url_host+"/jintai/safetyOrgFiles";
        /**
         * getSafetyEmergencyFolders
         * 应急响应管理-获取目录列表
         */
        public static String getSafetyEmergencyFolders = base_url_host+"/jintai/safetyEmergencyFolders";
        /**
         * getSafetyEmergencyFiles
         * 应急响应管理-获取文件列表
         */
        public static String getSafetyEmergencyFiles = base_url_host+"/jintai/safetyEmergencyFiles";
        /**
         * getJtPatrolDetails
         * 获取检查详情
         */
        public static String getJtPatrolDetails = base_url_host+"/jintai/getJtPatrolDetails";
        /**
         * getSafetyEnvironmentFolders
         * 安全环保信息-获取目录列表
         */
        public static String getSafetyEnvironmentFolders = base_url_host+"/jintai/safetyEnvironmentFolders";
        /**
         * getSafetyEnvironmentFiles
         * 安全环保信息-获取文件列表
         */
        public static String getSafetyEnvironmentFiles = base_url_host+"/jintai/safetyEnvironmentFiles";
        /**
         * 	getSafetyFloodFolders
         * 	安全迎汛管理-获取目录
         */
        public static String getSafetyFloodFolders = base_url_host+"/jintai/safetyFloodFolders";
        /**
         * getSafetyFloodFiles
         * 安全迎汛管理-获取文件列表
         */
        public static String getSafetyFloodFiles = base_url_host+"/jintai/safetyFloodFiles";
        /**
         * getSafetyFireFolders
         * 安全消防管理-获取目录列表
         */
        public static String getSafetyFireFolders = base_url_host+"/jintai/safetyFireFolders";
        /**
         * getSafetyFireFiles
         * 	安全消防管理-获取文件列表
         */
        public static String getSafetyFireFiles = base_url_host+"/jintai/safetyFireFiles";
        /**
         * getSafetyOtherFolders
         * 其他安全管理-获取目录列表
         */
        public static String getSafetyOtherFolders = base_url_host+"/jintai/safetyOtherFolders";
        /**
         * getSafetyOtherFiles
         * 	其他安全管理-获取文件列表
         */
        public static String getSafetyOtherFiles = base_url_host+"/jintai/safetyOtherFiles";
        /**
         * getjtProjecct
         * 获取金泰集团下的 项目列表
         */
        public static String getjtProjecct = base_url_host+"/jintai/getjtProjecct";
        /**
         * updatJtPatrol
         * 	更新检查状态（2完成，6完成整改）
         */
        public static String updatJtPatrolStatus = base_url_host+"/jintai/updatJtPatrolStatus";
        /**
         * getJtPatrolQuestionType
         * 	获取问题类型
         */
        public static String getJtPatrolQuestionType = base_url_host+"/jintai/getJtPatrolQuestionType";
        /**
         * addJtPatrolQuestion
         * 		添加质量检查问题
         */
        public static String addJtPatrolQuestion = base_url_host+"/jintai/addJtPatrolQuestion";
        /**
         * getjtSafetyDangerTypes
         * 获取 隐患排查类型列表
         */
        public static String getjtSafetyDangerTypes = base_url_host+"/jintai/getjtSafetyDangerTypes";
        /**
         * getjtSafetyDangers
         * 获取 隐患排查列表
         */
        public static String getjtSafetyDangers = base_url_host+"/jintai/getjtSafetyDangers";
        /**
         * jtSafetyDangerAdd
         * 添加 隐患排查
         */
        public static String jtSafetyDangerAdd = base_url_host+"/jintai/jtSafetyDangerAdd";
        /**
         * getjtSafetyDanger
         * 获取隐患排查详情
         */
        public static String getjtSafetyDanger = base_url_host+"/jintai/getjtSafetyDanger";
        /**
         * getjtUnit
         * 获取金泰集团下的 公司列表
         */
        public static String getjtUnit = base_url_host+"/jintai/getjtUnit";
        /**
         * jtSafetyDangerSend
         * 隐患排查 发送
         */
        public static String jtSafetyDangerSend = base_url_host+"/jintai/jtSafetyDangerSend";
        /**
         * updateJtPatrolToCheckSign
         * 	检查发送签字
         */
        public static String updateJtPatrolToCheckSign = base_url_host+"/jintai/updateJtPatrolToCheckSign";
        /**
         * updatePatrolSign
         * 		添加检查签字到检查记录表
         */
        public static String updatePatrolSign = base_url_host+"/jintai/updatePatrolSign";
        /**
         * addJtRectification
         * 添加整改
         */
        public static String addJtRectification = base_url_host+"/jintai/addJtRectification";
        /**
         * confirmJtRectification
         * 整改发起人确定整改完成
         */
        public static String confirmJtRectification = base_url_host+"/jintai/confirmJtRectification";
        /**
         * updateRectificationSign
         * 	添加检查签字到整改记录表
         */
        public static String updateRectificationSign = base_url_host+"/jintai/updateRectificationSign";
        /**
         * addRectQuestion
         * 		对问题进行整改
         */
        public static String addRectQuestion = base_url_host+"/jintai/addRectQuestion";
        /**
         * addJtCheck
         * 添加安全检查
         */
        public static String addJtCheck = base_url_host+"/jintai/addJtCheck";
        /**
         * getJtCheckQueTypeLists
         * 获取检查问题类型
         */
        public static String getJtCheckQueTypeLists = base_url_host+"/jintai/getJtCheckQueTypeLists";
        /**
         * getJtCheckLists
         * 获取安全检查列表
         */
        public static String getJtCheckLists = base_url_host+"/jintai/getJtCheckLists";
        /**
         * getJtCheckDetails
         * 获取安全检查详情
         */
        public static String getJtCheckDetails = base_url_host+"/jintai/getJtCheckDetails";
        /**
         * addJtCheckRecIdea
         * 	添加整改意见
         */
        public static String addJtCheckRecIdea = base_url_host+"/jintai/addJtCheckRecIdea";
        /**
         * addJtCheckUserSign
         * 	签字人员签字
         */
        public static String addJtCheckUserSign = base_url_host+"/jintai/addJtCheckUserSign";
        /**
         * addJtCheckRectification
         * 		添加安全整改、复查
         */
        public static String addJtCheckRectification = base_url_host+"/jintai/addJtCheckRectification";
        /**
         * getJtPatrolMimes
         * 获取检查、整改方案
         */
        public static String getJtPatrolMimes = base_url_host+"/jintai/getJtPatrolMimes";
        /**
         * jtSafetyDangerPin
         * 隐患排查 回复 复查 销项
         */
        public static String jtSafetyDangerPin = base_url_host+"/jintai/jtSafetyDangerPin";

        /**
         * 获取月度计价任务列表数量
         */
        public static String getMonthlyPriceMainTasksCount = base_url_host+"/getMonthlyPriceMainTasksCount";

        /**
         * 获取变洽签任务列表数量
         */
        public static String getBqqMainTasksCount = base_url_host+"/bqqMainTasksCount";

        /**
         * 选定监理公司中标
         */
        public static String selectedCompetitive = base_url_host+"/selectedCompetitive";

        /**
         * 回复对内的招标（同意或拒绝）
         */
        public static String replyInvitation = base_url_host+"/replyInvitation";



        /**
         * getYtUserAuth
         * 获取云图用户授权信息(关联瑞金等)[云图APP中调用]
         */
        public static String getYtUserAuth = base_url_host+"/ytUserAuth";
        /**
         * getAnnouncements
         * 甲方公告-获取列表
         */
        public static String getAnnouncements = base_url_host+"/jintai/announcements";
        /**
         * addAnnouncement
         * 甲方公告-发布公告
         */
        public static String addAnnouncement = base_url_host+"/jintai/announcement";
        /**
         * 	getAnnouncement
         * 	甲方公告-获取详情
         */
        public static String 	getAnnouncement = base_url_host+"/jintai/v2/announcement";
        /**
         * 	bindYtUserAuth
         * 绑定其他app用户(云图关联瑞金等)
         */
        public static String 	bindYtUserAuth = base_url_host+"/bindYtUserAuth";
        /**
         * 	unbindYtUserAuth
         * 	解绑其他app用户(云图关联瑞金等)
         */
        public static String 	unbindYtUserAuth = base_url_host+"/unbindYtUserAuth";
        /**
         * 	getYtProjectAuth
         * 	获取云图项目授权情况(关联瑞金等)
         */
        public static String 	getYtProjectAuth = base_url_host+"/ytProjectAuth";
        /**
         * 	getOpenProjectGroup
         * 		查看项目详情(可供第三方后台调用)（app跳转到云图后可调用查看项目详情）
         */
        public static String 	getOpenProjectGroup = base_url_host+"/open/projectGroup";
        /**
         * getQualityControlFolders
         * 质量控制-获取目录列表
         */
        public static String getQualityControlFolders = base_url_host+"/jintai/qualityControlFolders";
        /**
         * getQualityControlFiles
         * 质量控制-获取文件列表
         */
        public static String getQualityControlFiles = base_url_host+"/jintai/qualityControlFiles";
        /**
         * getQualityAcceptFolders
         * 质量验收交接-获取目录列表
         */
        public static String getQualityAcceptFolders = base_url_host+"/jintai/qualityAcceptFolders";
        /**
         * getQualityAcceptFiles
         * 质量验收交接-获取文件列表
         */
        public static String getQualityAcceptFiles = base_url_host+"/jintai/qualityAcceptFiles";
        /**
         * 	获得所有监理需求人员
         */
        public static String 	getUnitDemandUsers = base_url_host+"/unitDemandUsers";
        /**
         * getjtSafetyEnvironmentInspectionTypes
         * 	获取 安全环保检查 类型列表
         */
        public static String getjtSafetyEnvironmentInspectionTypes = base_url_host+"/jintai/getjtSafetyEnvironmentInspectionTypes";
        /**
         * getjtSafetyEnvironmentInspections
         * 获取 安全环保检查列表
         */
        public static String getjtSafetyEnvironmentInspections = base_url_host+"/jintai/getjtSafetyEnvironmentInspections";
        /**
         * getjtSafetyEnvironmentInspection
         * 获取安全环保检查详情
         */
        public static String getjtSafetyEnvironmentInspection = base_url_host+"/jintai/getjtSafetyEnvironmentInspection";
        /**
         * jtSafetyEnvironmentInspectionPin
         * 	安全环保检查 回复 复查 销项
         */
        public static String jtSafetyEnvironmentInspectionPin = base_url_host+"/jintai/jtSafetyEnvironmentInspectionPin";
        /**
         * jtSafetyEnvironmentInspectionSend
         * 安全环保检查 发送
         */
        public static String jtSafetyEnvironmentInspectionSend = base_url_host+"/jintai/jtSafetyEnvironmentInspectionSend";
        /**
         * jtSafetyEnvironmentInspectionAdd
         * 添加 安全环保检查
         */
        public static String jtSafetyEnvironmentInspectionAdd = base_url_host+"/jintai/jtSafetyEnvironmentInspectionAdd";
        /**
         * 当前模块都是从龙湖移植过来的
         */
        /**
         * 接口用途：	获得层列表
         * method：	GET
         * 接口地址：	/projectFloors/{project_id}
         */
        public static String getProjectFloors = base_url_host + "/longhu/lhProjectFloors";
        /**
         * 接口用途：	初始化楼层信息
         * method：	POST
         * 接口地址：	/initFoors
         */
        public static String initFoors = base_url_host + "/initFoors";

        /*
         *	获取 标注
         */
        public static String getProjectDrawingMarks = base_url_host + "/getProjectDrawingMarks";

        /**
         * 接口用途：	获取层下的 房间列表
         * method：	GET
         * 接口地址：	api/floorUnderRooms/{house_delivery_floor_id}
         */
        public static String floorUnderRooms = base_url_host + "/floorUnderRooms";

        /**
         * 接口名称：	getTenderss
         * 接口用途：	根据项目 查询 标段列表
         */
        public static String getTenderss = base_url_host + "/getTenderss";
        /**
         * 接口名称：	getTenders
         * 根据标段 ID查看详情
         */
        public static String getTenders = base_url_host + "/getTenders";


        /**
         * 接口名称：	tendersProject
         * 接口用途：	单体设置所属标段
         * method：	PUT
         * 接口地址：	/api/tendersProject
         */
        public static String tendersProject = base_url_host + "/tendersProject";


        /**
         * 接口名称：	tendersAdd
         * 添加 标段
         */
        public static String tendersAdd = base_url_host + "/tendersAdd";
        /**
         * 修改 项目 标记
         */
        public static String projectMarkAdd = base_url_host + "/projectMarkAdd";
        /**
         * 修改户标注位置信息
         */
        public static String updateRoomLocations = base_url_host + "/updateRoomLocations";
        /**
         * 获取工序元素列表(层户无关 / 层户相关level=1)
         */
        public static String getProcessItems = base_url_host + "/processItems";
        /**
         * 接口名称：	getPatrolThirdFloorTask
         * 根据验收状态获取工序列表（工序消息列表1）
         */
        public static String getProcessTasks = base_url_host + "/processTasks";

        /**
         * 接口名称：	getPatrolThirdFloorTask
         * 获取工序整改通知列表
         */
        public static String getProcessNotices = base_url_host + "/processNotices";
        /**
         * 获取某户的工序列表(户相关level=4)
         */
        public static String getProcessRoomItems = base_url_host + "/processRoomItems";
        /**
         * 接口名称：	uploadProcessRoomImg
         * 上传检查项图片(status=3双方均不可执行，status=1施工方不可执行)
         */
        public static String uploadProcessRoomImg = base_url_host + "/processRoomImg";
        /**
         * 接口名称：	deleteProcessRoomImg
         * 删除检查项图片(status=3双方均不可执行，status=1施工方不可执行)
         */
        public static String deleteProcessRoomImg = base_url_host + "/processRoomImg";
        /**
         * 接口名称：	sendProcessNotice
         * 接口用途：	发送工序整改通知(监理可执行，status=3不可执行)
         */
        public static String sendProcessNotice = base_url_host + "/sendProcessNotice";

        /**
         * 确认工序(status=3双方均不可执行，status=1施工方不可执行)
         */
        public static String confirmProcess = base_url_host + "/confirmProcess";

        /**
         * 接口名称：	getProcessRoom
         * 获取某户的工序详情
         */
        public static String getProcessRoom = base_url_host + "/processRoom";

        /**
         * 接口名称：	getPatrolThirdFloorTask
         * 获取某楼的某一户的任务
         */
        public static String getPatrolThirdFloorTask = base_url_host + "/longhu/getPatrolThirdFloorTask";
        /**
         * 接口名称：	getProcessRoomsStatus
         * 获取某单体每户的某工序的验收进度
         */
        public static String getProcessRoomsStatus = base_url_host + "/processRoomsStatus";

        /**
         * 获取工序元素列表(层相关，level=2,3)
         */
        public static String getProcessFloorItems = base_url_host + "/processFloorItems";
        /**
         * 选择工艺(层相关)
         */
        public static String checkeProcessTechnology = base_url_host + "/checkeProcessTechnology";

        /**
         * 接口用途：	获取可以同步工序设置的楼层列表
         * method：	GET
         * 接口地址：	/canSyncProcessFloors/{project_id}
         */
        public static String getCanSyncProcessFloors = base_url_host + "/canSyncProcessFloors";

        /**
         * 接口用途：	同步工艺设置到其他层（未初始化的不可同步，已初始化的不可被同步）
         * method：	POST
         */
        public static String syncProcessFloors = base_url_host + "/syncProcessFloors";

        /**
         * 添加质量验收
         */
        public static String addPatrolThird = base_url_host + "/longhu/addPatrolThird";

        /**
         * 获取巡检的责任人和参与人
         */
        public static String getPatrolThirdDutyUsers = base_url_host + "/longhu/getPatrolThirdDutyUsers";
        /**
         * 获取主题
         */
        public static String getPatrolThirditem = base_url_host + "/longhu/getPatrolThirditem";
        /**
         * 获取主题
         */
        public static String getPatrolThirdTheme = base_url_host + "/longhu/getPatrolThirdTheme";
        /**
         * 获取分类
         */
        public static String getPatrolThirdType = base_url_host + "/longhu/getPatrolThirdType";
        /**
         * qhj获取巡检列表（前海投控和第三方巡查）
         */
        public static String getPatrolThirdLists = base_url_host + "/longhu/getPatrolThirdLists";
        /**
         * 删除巡检任务
         */
        public static String deletePatrolThird = base_url_host + "/deletePatrolThird";
        /**
         * 获取质量检测详情
         */
        public static String getPatrolThirdDetails = base_url_host + "/longhu/getPatrolThirdDetails";
        /**
         * 销项
         */
        public static String rejectPatrolThird = base_url_host + "/longhu/rejectPatrolThird";
        /**
         * 获取元素详情
         */
        public static String getPatrolThirdItemDetails = base_url_host + "/longhu/getPatrolThirdItemDetails";
        /**
         * 获取 图纸标注
         */
        public static String getPatrolDrawingMarks = base_url_host + "/getPatrolDrawingMarks";
        /**
         * 获取标记下的所有任务
         */
        public static String getPatrolThirdListsByMark = base_url_host + "/longhu/getPatrolThirdListsByMark";
        /**
         * 更新 文件 标注
         */
        public static String patrolDrawingMarkAdd = base_url_host + "/patrolDrawingMarkAdd";
        /**
         * 回复驳回
         */
        public static String addPatrolThirdReply = base_url_host + "/longhu/addPatrolThirdReply";
        /**
         * lhUploadFloorDrawing
         * 	层挂接图纸 文件上传
         */
        public static String lhUploadFloorDrawing = base_url_host + "/longhu/lhUploadFloorDrawing";
        /**
         * lhInitFoors
         * 初始化楼层信息
         */
        public static String lhInitFoors = base_url_host+"/longhu/lhInitFoors";
        /**
         * lhProjectFloors
         * 获得层列表
         */
        public static String lhProjectFloors = base_url_host+"/longhu/lhProjectFloors";
        /**
         * 当前模块都是从龙湖移植过来的
         */

        /**
         * 接口用途：	获取层下的 房间列表
         * method：	GET
         * 接口地址：		/api/longhu/lhFloorUnderRooms/{house_delivery_floor_id}
         */
        public static String lhFloorUnderRooms = base_url_host + "/longhu/lhFloorUnderRooms";
        /**
         * 获取 图纸标注
         */
        public static String lhGetPatrolDrawingMarks = base_url_host + "/longhu/getPatrolDrawingMarks";
        /**
         * 更新 文件 标注
         */
        public static String lhPatrolDrawingMarkAdd = base_url_host + "/longhu/patrolDrawingMarkAdd";
        /**
         * lhUpdateRoomLocations
         * 修改户标注位置信息
         */
        public static String lhUpdateRoomLocations = base_url_host+"/longhu/lhUpdateRoomLocations";
        /**
         * getProcessStudyMaterials
         * 学习资料
         */
        public static String getProcessStudyMaterials = base_url_host+"/processStudyMaterials";
        /**
         * getBQQTaskLists
         * 获取变洽签的待办
         */
        public static String getBQQTaskLists = base_url_host+"/getBQQTaskLists";

        /**
         * 获取变洽签汇总表（网页形式）
         */
        public static String getBqqSummaryTable = base_url_host+"/open/bqqSummaryTable";
        /**
         * getZLJCLists
         * 获取质量检查待办
         */
        public static String getZLJCLists = base_url_host+"/jintai/getZLJCLists";
        /**
         * getJtAQJCLists
         * 获取安全检查待办
         */
        public static String getJtAQJCLists = base_url_host+"/jintai/getJtAQJCLists";
        /**
         * getAQHBJCLists
         * 获取安全环保检查待办
         */
        public static String getAQHBJCLists = base_url_host+"/jintai/getAQHBJCLists";
        /**
         * getAQYHPCLists
         * 获取安全隐患排查待办
         */
        public static String getAQYHPCLists = base_url_host+"/jintai/getAQYHPCLists";
        /**
         * getYDJJTaskLists
         * 获取月度计价的待办
         */
        public static String getYDJJTaskLists = base_url_host+"/getYDJJTaskLists";

        /**
         * 月度计价统计
         */
        public static String getMonthlyPriceStatistic = base_url_host+"/open/getMonthlyPriceStatistic";

        /**
         * 获取项目下月度计价的申报单位
         */
        public static String getMonthlyPriceUnits = base_url_host+"/getMonthlyPriceUnits";

        /**
         * getSmartAlarms
         * 	获取智慧工地-临边防护 报警列表
         */
        public static String getSmartAlarms = base_url_host+"/smart/alarms";

        /*移植架子队模块的接口*/

        /**
         * 	获取隧道的权限
         */
        public static String getTunnelAuth = base_url_host + "/tunnel/auth";


        /**
         * 	获取某项目的所有楼(不分组 不含位置信息)
         */
        public static String getProjectsByType = base_url_host + "/projects";

        /**
         * getOrderNumber
         * 获取工序（工单）各状态数量
         * /orderNumber/{gdid}
         */
        public static String getOrderNumber = base_url_host+"/tunnel/orderNumber";



        /**
         * 获取可以添加到组的人员列表
         */
        public static String getCanAddTeamUsers = base_url_host+"/tunnel/canAddTeamUsers";
        /**
         * 获取组的成员列表
         */
        public static String getTeamMembers = base_url_host+"/tunnel/teamMembers";


        /**
         * 修改隧道组成员的权限（含删除）(施工1级可操作)
         */
        public static String updateTeamMemberType = base_url_host+"/tunnel/teamMemberType";

        /**
         * 修改隧道组的名称
         */
        public static String updateTunnelTeamName = base_url_host+"/tunnel/teamName";


        /**
         * 添加隧道组的成员(施工1级可操作)
         */
        public static String addTeamMembers = base_url_host+"/tunnel/teamMembers";

        /**
         * 创建隧道的组(施工1级可操作)
         */
        public static String addTunnelTeam = base_url_host+"/tunnel/team";


        /**
         * 获取某单体的工点列表
         */
        public static String getWorksites = base_url_host+"/tunnel/worksites";


        /**
         * 创建工点(施工1级、组员可操作)
         */
        public static String addWorksite = base_url_host+"/tunnel/worksite";

        /**
         * 创建围岩段(施工1级、组员可操作)
         */
        public static String addWallRock = base_url_host+"/tunnel/wallRock";


        /**
         * 获取隧道的组列表
         */
        public static String getTunnelTeams = base_url_host+"/tunnel/teams";


        /**
         * 验收工序(process_status=3且accept_status=-1 时可操作)
         */
        public static String acceptProcess = base_url_host+"/tunnel/acceptProcess";


        /**
         * 复验工序（process_status=3且accept_status=0 时可操作）
         */
        public static String reviewProcess = base_url_host+"/tunnel/reviewProcess";

        /**
         * 删除工单
         */
        public static String deleteOrder = base_url_host+"/tunnel/deleteOrder";

        /**
         * 	删除模板
         */
        public static String deleteTemplate = base_url_host+"/tunnel/deleteTemplate";

        /**
         * 	修改工单
         */
        public static String updateOrderInfo = base_url_host+"/tunnel/updateOrderInfo";

        /**
         * 	根据执行人获取对应的工单列表
         */
        public static String getOrderByExcutor = base_url_host+"/tunnel/getOrderByExcutor";


        /**
         * 获取工序的的前置和后置工序
         */
        public static String getProcessPreAndPost = base_url_host+"/tunnel/getProcessPreAndPost";
        /**
         * 开始工序（process_status=1，若有前置则必须前置process_status=4 时可操作）
         */
        public static String startProcess = base_url_host+"/tunnel/startProcess";


        /**
         * 完成工序（process_status=2 时可操作）Put
         */
        public static String finishProcess = base_url_host+"/tunnel/finishProcess";

        /**
         * 通知后置工序准备（已开始 未验收的可操作）
         */
        public static String noticePostProcess = base_url_host+"/tunnel/noticePostProcess";
        /**
         * 根据里程查询分类列表
         */
        public static String getListsByMileage = base_url_host+"/tunnel/getListsByMileage";
        /**
         * getTemplateLists
         * 	获取工点下的模板列表
         */
        public static String getTemplateLists = base_url_host+"/tunnel/getTemplateLists";
        /**
         * 获取模板详情
         */
        public static String getTemplateDtails = base_url_host+"/tunnel/getTemplateDtails";

        /**
         * 获取施工方法和其施工部位
         * method：	GET
         */
        public static String getConstructionMethods = base_url_host + "/tunnel/constructionMethods";

        /**
         * 获取预加载工序列表
         * method：	GET
         */
        public static String getTemplateProcess = base_url_host + "/tunnel/getTemplateProcess";

        /**
         * 获取工点的围岩段列表
         * method：	GET
         */
        public static String getWallRocks = base_url_host + "/tunnel/wallRocks";
        /**
         * 获取工点的任务分类列表
         */
        public static String getGxxhs = base_url_host + "/tunnel/gxxhs";


        /**
         * getOrders
         * 按状态获取工单列表(其工序中有一个处于该状态即返回)
         */
        public static String getOrders = base_url_host+"/tunnel/orders";
        /**
         * getTemplateOrder
         * 	查看模板工单详情
         */
        public static String getTemplateOrder = base_url_host+"/tunnel/templateOrder";

        /**
         * 添加模板POST
         */
        public static String addTemplate = base_url_host+"/tunnel/addTemplate";
        /**
         * addWorkOrder
         * 新建工单
         */
        public static String addWorkOrder = base_url_host+"/tunnel/addWorkOrder";
        /**
         * 添加临时工单（不在模型上显示）
         */
        public static String addTemWorkOrder = base_url_host+"/tunnel/addTemWorkOrder";


        /**
         * 添加临时工单(在模型上显示)
         */
        public static String addTemporaryWorkOrder = base_url_host+"/tunnel/addTemporaryWorkOrder";
        /**
         * 获取工点的人员列表
         */
        public static String getUsersOfGd = base_url_host+"/usersOfGd";


        /**
         * 查看临时工单详情
         */
        public static String getTemporaryOrder = base_url_host+"/tunnel/temporaryOrder";

        /**
         * 根据用户获取相关工序
         */
        public static String getProcessListsByUser = base_url_host+"/tunnel/getProcessListsByUser";

        /**
         * 获取工序详情
         */
        public static String getTemplateOrderProcess=base_url_host+"/tunnel/templateOrderProcess";


        /**
         * 搜索工序列表
         */
        public static String searchProcessLists = base_url_host+"/tunnel/searchProcessLists";

        /**
         * 验收工序
         */
        public static String getAcceptProcess=base_url_host+"/acceptProcess";
        /**
         * 根据分类获取工单列表
         */
        public static String getOrderLists = base_url_host+"/tunnel/getOrderLists";
        /**
         * 修改工序实际开始时间
         */

        public static String modifyProcessStartTime=base_url_host+"/tunnel/modifyProcessStartTime";

        /**
         * 修改工序预计耗时（计划结束时间
         */
        public static String modifyProcessExpectTime=base_url_host+"/tunnel/modifyProcessExpectTime";
        /*移植架子队模块的接口*/

        /**
         * searchHazardsForm
         * 搜索安全危险源登记表
         */
        public static String searchHazardsForm=base_url_host+"/jintai/open/searchHazardsForm";
        /**
         * getjtSafetyDangerBacklogNumber
         * 获取隐患排查 待办数量
         */
        public static String getjtSafetyDangerBacklogNumber = base_url_host+"/jintai/getjtSafetyDangerBacklogNumber";
        /**
         * getjtSafetyEnvironmentInspectionBacklogNumber
         * 获取 安全环保 待办数量
         */
        public static String getjtSafetyEnvironmentInspectionBacklogNumber = base_url_host+"/jintai/getjtSafetyEnvironmentInspectionBacklogNumber";
        /**
         * getQualityAcceptOnlineExcelSign
         * 质量验收交接在线编辑-获取签字情况(accept_template_id大于0时才用)
         */
        public static String getQualityAcceptOnlineExcelSign = base_url_host+"/jintai/qualityAcceptOnlineExcelSign";
        /**
         * qualityAcceptOnlineExcelSign
         * 质量验收交接在线编辑-签字
         */
        public static String qualityAcceptOnlineExcelSign = base_url_host+"/jintai/qualityAcceptOnlineExcelSign";
        /**
         * getQualityControlOnlineExcelSigns
         * 获取质量控制在线编辑文件——签名情况
         */
        public static String getQualityControlOnlineExcelSigns = base_url_host+"/jintai/qualityControlOnlineExcelSigns";
        /**
         * qualityControlOnlineExcelSign
         * 质量控制在线编辑 - 签字
         */
        public static String qualityControlOnlineExcelSign = base_url_host+"/jintai/qualityControlOnlineExcelSign";
        /**
         * 设置文件归档信息 (主责任&amp;任务未确认&amp;未设置过)
         */
        public static String setTaskMimeTemplateType=base_url_host+"/setTaskMimeTemplateType";

        /**
         * getGeneral
         * 查看项目概要信息
         */
        public static String getGeneral=base_url_host+"/general";
        /**
         * getQQGZTaskLists
         * 	获取前期工作的待办任务列表
         */
        public static String getQQGZTaskLists=base_url_host+"/getQQGZTaskLists";
        /**
         * getJFGLTaskLists
         * 	获取交房管理的待办任务
         */
        public static String getJFGLTaskLists=base_url_host+"/getJFGLTaskLists";
        /**
         * getUsersOfProjectGroupByUnitV2
         * 获取项目的所有用户(以公司分组返回 二级列表) V2
         */
        public static String getUsersOfProjectGroupByUnitV2=base_url_host+"/v2/usersOfProjectGroupByUnit";
        /**
         * getNoticeProjects
         * 获取通知单体列表(带通知数量)
         */
        public static String getNoticeProjects=base_url_host+"/noticeProjects";

        /**
         * deleteGroup
         * 解散群组 (群主操作)
         */
        public static String deleteGroup = base_url_host+"/group";

        /**
         * 查看项目概要-施工报验列表
         */
        public static String getGeneralInspections = base_url_host+"/general/inspections";
        /**
         * getXCJHTaskLists
         * 获取现场交互的待办任务列表(20180402)
         */
        public static String getXCJHTaskLists = base_url_host+"/getXCJHTaskLists";
        /**
         * 获取施工任务的可执行人员列表(用于分配任务人员选择)
         */
        public static String getCanSgTaskAssignUsers = base_url_host+"/canSgTaskAssignUsers";
        /**
         * addProgressNotice
         * 新建施工通知
         */
        public static String addProgressNotice = base_url_host + "/addProgressNotice";
        /**
         * 获得项目下施工方的单位（除自己单位）
         */
        public static String getProgressUnits = base_url_host
                + "/getProgressUnits";

        /**
         *获取本单位下已经创建日志或日记的用户
         */
        public static String getUserLogUsers = base_url_host
                + "/getUserLogUsers";
        /**
         * getTaskProjects
         *	获取监理任务单体列表(带已分配任务的数量)	0监理任务[默认] 1施工任务 -1所有
         */
        public static String getTaskProjects = base_url_host + "/taskProjects";
        /**
         * getAcceptanceProjects
         *	获取工程概况——过程验收单体列表(带数量)
         */
        public static String getAcceptanceProjects = base_url_host + "/acceptanceProjects";

        /**
         *	查看项目概要-施工报验数量
         */
        public static String getGeneralInspectionCount = base_url_host + "/general/inspectionCount";
        /**
         * isSmExistImportentFile
         * 判断关键工序是否存在
         */
        public static String isSmExistImportentFile = base_url_host+"/isSmExistImportentFile";
        /**
         * getProjectGroupMemberByUnits
         * 获取项目中成员（项目+监理+总包+分包）===（20180420）
         */
        public static String getProjectGroupMemberByUnits = base_url_host+"/getProjectGroupMemberByUnits";
        /**
         * getJDGLTaskLists
         * 	获取进度计划管理的待办列表
         */
        public static String getJDGLTaskLists = base_url_host+"/getJDGLTaskLists";
        /**
         * getPathDataByMonth
         *
         */
        public static String getPathDataByMonth = base_url_host+"/getPathDataByMonth";
        /**
         * getAcceptanceStatistics
         * 	验收统计列表 （工程概况）
         */
        public static String getAcceptanceStatistics = base_url_host+"/acceptanceStatistics";

        /**
         * 任务模板签字（非执行人调用）
         */
        public static String signTask = base_url_host+"/signTask";

        /**
         * addSccQuestion
         *添加安全检查记录
         */
        public static String addSccQuestion = base_url_host+"/addSccQuestion";

        /**
         * getJtNewPatrolLists
         *获取质量检查列表
         */
        public static String getJtNewPatrolLists = base_url_host+"/jintai/getJtNewPatrolLists";
        /**
         * addJtNewPatrol
         *添加质量检查
         */
        public static String addJtNewPatrol = base_url_host+"/jintai/addJtNewPatrol";
        /**
         * addSccRectificationResult
         *整改安全检查记录
         */
        public static String addSccRectificationResult = base_url_host+"/addSccRectificationResult";
        /**
         * addSccQuestion
         *添加安全巡查
         */
        public static String addSccCheck = base_url_host+"/addSccCheck";
        /**
         * getSccDetails
         *获取巡查详情
         */
        public static String getSccDetails = base_url_host+"/getSccDetails/";
        /**
         * addSccRectification
         *提交整改
         */
        public static String addSccRectification = base_url_host+"/addSccRectification";
        /**
         * * addSafetyAccRectification
         *提交整改（安全验收）
         */
        public static String addSafetyAccRectification = base_url_host+"/addSafetyAccRectification";
        /**
         * getSccList
         *获取巡查列表
         */
        public static String getSccList = base_url_host+"/getSccList";
        /**
         * getSafetyAccLists
         *获取安全验收列表
         */
        public static String getSafetyAccLists = base_url_host+"/getSafetyAccLists";
        /**
         * getSccReport
         *获取巡查报告
         */
        public static String getSccReport = base_url_host+"/getSccReport";
        /**
         * saveSccRectification
         *获取巡查详情
         */
        public static String saveSccRectification = base_url_host+"/saveSccRectification";
        /**
         * addSccRecheck
         *保存 销项
         */
        public static String addSccRecheck = base_url_host+"/addSccRecheck";
        /**
         * addSccOutputFormInSign
         *保存安全报告签名文件
         */
        public static String addSccOutputFormInSign = base_url_host+"/addSccOutputFormInSign";
        /**
         * getDangerousMembers
         *	获取小组成员列表(危大工程)
         */
        public static String getDangerousMembers = base_url_host+"/getDangerousMembers";
        /**
         * getDangerousMemberUser
         *		获取 本人的小组信息
         */
        public static String getDangerousMemberUser = base_url_host+"/getDangerousMemberUser";
        /**
         * getDangerousProjectUnitUsers
         *	获取项目 成员 （排除 已添加到小组的成员）
         */
        public static String getDangerousProjectUnitUsers = base_url_host+"/getDangerousProjectUnitUsers";
        /**
         * dangerousMemberAdd
         *	添加小组成员(危大工程)
         */
        public static String dangerousMemberAdd = base_url_host+"/dangerousMemberAdd";
        /**
         * dangerousMemberPut
         *	修改小组成员权限
         */
        public static String dangerousMemberPut = base_url_host+"/dangerousMemberPut";
        /**
         * getDangerousNodeItmes
         * 获取 预加载节点列表
         */
        public static String getDangerousNodeItmes = base_url_host+"/getDangerousNodeItmes";
        /**
         * getDangerousDesignItmes
         * 获取预加载 文件列表（归档资料）
         */
        public static String getDangerousDesignItmes = base_url_host+"/getDangerousDesignItmes";
        /**
         * dangerousNodeAdd
         * 	添加任务节点
         */
        public static String dangerousNodeAdd = base_url_host+"/dangerousNodeAdd";
        /**
         * getDangerousTaskNodes
         * 	获取 任务 节点列表
         */
        public static String getDangerousTaskNodes = base_url_host+"/getDangerousTaskNodes";
        /**
         * dangerousTaskNodeDel
         * 	删除 任务节点
         */
        public static String dangerousTaskNodeDel = base_url_host+"/dangerousTaskNodeDel";
        /**
         * dangerousTaskNodePutName
         * 		修改 任务节点 备注名称
         */
        public static String dangerousTaskNodePutName = base_url_host+"/dangerousTaskNodePutName";
        /**
         * dangerousTaskNodeProject
         * 		任务节点 挂接 单体
         */
        public static String dangerousTaskNodeProject = base_url_host+"/dangerousTaskNodeProject";
        /**
         * dangerousTaskNodeOpen
         * 	开启 任务节点
         */
        public static String dangerousTaskNodeOpen = base_url_host+"/dangerousTaskNodeOpen";
        /**
         * getDangerousTaskNodeNumber
         * 获取 未处理节点数量和列表 代签字数量
         */
        public static String getDangerousTaskNodeNumber = base_url_host+"/getDangerousTaskNodeNumber";
        /**
         * getDangerousTasks
         * 	获取 任务列表
         */
        public static String getDangerousTasks = base_url_host+"/getDangerousTasks";
        /**
         * getDangerousTask
         * 		获取 任务详情
         */
        public static String getDangerousTask = base_url_host+"/getDangerousTask";

        /**
         *批量删除报验文件
         */
        public static String deleteInspectFiles = base_url_host+"/inspectFiles";
        /**
         * getDangerousTaskTemplates
         *	获取任务模板列表
         */
        public static String getDangerousTaskTemplates = base_url_host+"/getDangerousTaskTemplates";
        /**
         * dangerousTaskSave
         *	任务 保存
         */
        public static String dangerousTaskSave = base_url_host+"/dangerousTaskSave";
        /**
         * saveDangerousTemplate
         *		保存 修改 模板
         */
        public static String saveDangerousTemplate = base_url_host+"/saveDangerousTemplate";
        /**
         * getDangerousTemplateSigns
         *		获取 模板签名情况
         */
        public static String getDangerousTemplateSigns = base_url_host+"/getDangerousTemplateSigns";
        /**
         * signDangerousTemplate
         *	模板签名
         */
        public static String signDangerousTemplate = base_url_host+"/signDangerousTemplate";
        /**
         * getProuectGroupMemberUsers
         *	获取 该项目的所有小组成员 以公司分组
         */
        public static String getProuectGroupMemberUsers = base_url_host+"/getProuectGroupMemberUsers";
        /**
         * dangerousTaskShare
         *		任务分享
         */
        public static String dangerousTaskShare = base_url_host+"/dangerousTaskShare";
        /**
         * dangerousTaskSignComplete
         *		签字完成
         */
        public static String dangerousTaskSignComplete = base_url_host+"/dangerousTaskSignComplete";
        /**
         * getDangerousSignTasks
         *		获取 代签字列表
         */
        public static String getDangerousSignTasks = base_url_host+"/getDangerousSignTasks";
        /**
         * getDangerousFilesNodes
         *		获取 危大归档节点
         */
        public static String getDangerousFilesNodes = base_url_host+"/getDangerousFilesNodes";
        /**
         * getDangerousTaskMimes
         *		获取 危大归档文件
         */
        public static String getDangerousTaskMimes = base_url_host+"/getDangerousTaskMimes";
        /**
         * 获取项目关联的项目列表
         * getRelativeProjectGroups
         */
        public static String getRelativeProjectGroups = base_url_host+"/getRelativeProjectGroups";

        /**
         * 驳回报验(监理可执行)
         */
        public static String rejectInspectTask = base_url_host+"/rejectInspectTask";
        /**
         * 清空报验模板签字，回到可编辑状态（报验人可执行）
         */
        public static String clearInspectTemplate = base_url_host+"/clearInspectTemplate";


        /**
         * 添加安全验收
         * addSafetyAcc
         */
        public static String addSafetyAcc = base_url_host+"/addSafetyAcc";
        /**
         * 添加安全验收
         * addSafetyAccRectResult
         */
        public static String addSafetyAccRectResult = base_url_host+"/addSafetyAccRectResult";
        /**
         * 获取安全验收详情
         * getSafetyAccDetails
         */
        public static String getSafetyAccDetails = base_url_host+"/getSafetyAccDetails";
        /**
         * 安全验收审查
         * addSafetyAccRecheck
         */
        public static String addSafetyAccRecheck = base_url_host+"/addSafetyAccRecheck";

        /**
         * 安全验收报告 GET
         * getSafetyAccReport
         */
        public static String getSafetyAccReport = base_url_host+"/getSafetyAccReport";

        /**
         * getjtQualityDailyTypes
         * 获取 日常检查 类型列表
         */
        public static String getjtQualityDailyTypes = base_url_host+"/jintai/getjtQualityDailyTypes";
        /**
         * getUnitsByParentUnits
         * getUnitsByParentUnits
         */
        public static String getUnitsByParentUnits = base_url_host+"/getUnitsByParentUnits";

        /**
         * jtQualityDailyAdd
         * 添加 日常检查
         */
        public static String jtQualityDailyAdd = base_url_host+"/jintai/jtQualityDailyAdd";
        /**
         * getjtQualityDailys
         * 获取 安全环保检查列表
         */
        public static String getjtQualityDailys = base_url_host+"/jintai/getjtQualityDailys";
        /**
         * getjtQualityDaily
         * 获取安全环保检查详情
         */
        public static String getjtQualityDaily = base_url_host+"/jintai//getjtQualityDaily";
        /**
         * 	jtQualityDailySend
         * 	安全环保检查 发送
         */
        public static String jtQualityDailySend = base_url_host+"/jintai/jtQualityDailySend";
        /**
         * 	jtQualityDailyPin
         * 	安全环保检查 回复 复查 销项
         */
        public static String jtQualityDailyPin = base_url_host+"/jintai/jtQualityDailyPin";
        /**
         * getjtQualityDailyBacklogNumber
         * 	获取 安全环保 待办数量
         */
        public static String getjtQualityDailyBacklogNumber = base_url_host+"/jintai/getjtQualityDailyBacklogNumber";
        /**
         * addSafetyAccOutputFormInSign
         * 	上传签过字的记录表
         */
        public static String addSafetyAccOutputFormInSign = base_url_host+"/addSafetyAccOutputFormInSign";
        /**
         * getSafetyAccDraftCount
         * 	获取草稿箱数量
         */
        public static String getSafetyAccDraftCount = base_url_host+"/getSafetyAccDraftCount";
        /**
         * getjtSafetyDailyUnits
         * 日常检查 获取 公司列表
         */
        public static String getjtSafetyDailyUnits = base_url_host+"/jintai/getjtSafetyDailyUnits";
        /**
         * getJtPatrolListByStatus
         * 获取质量检查任务列表
         */
        public static String getJtPatrolListByStatus = base_url_host+"/jintai/getJtPatrolListByStatus";
        /**
         * addJtPatrolSign
         * 	待检查、待确认、待整改、整改待确认、待复查签字
         */
        public static String addJtPatrolSign = base_url_host+"/jintai/addJtPatrolSign";
        /**
         * getDangerousProjects
         * 	危大工程 获取单体列表
         */
        public static String getDangerousProjects = base_url_host+"/getDangerousProjects";

        /**
         * 获取人员管理管理员信息（考勤管理员信息）
         */
        public static String getPersonalManagementManager = base_url_host+"/personalManagementManager";
        /**
         * getSmDelayTask
         * 获取延迟报警的节点列表
         */
        public static String getSmDelayTask = base_url_host+"/getSmDelayTask";
        /**
         * getBLSmWarningTaskLists
         * 获取进度计划管理的报警待办列表
         */
        public static String getBLSmWarningTaskLists = base_url_host+"/getBLSmWarningTaskLists";
        /**
         * getUserAccounts
         * 	获取我的账号列表
         */
        public static String getUserAccounts = base_url_host+"/userAccounts";
        /**
         * addSubUser
         * 	添加子账号
         */
        public static String addSubUser = base_url_host+"/addSubUser";
        /**
         * cancelSubUser
         * 撤销子账号(未审核、审核未通过的)
         */
        public static String cancelSubUser = base_url_host+"/cancelSubUser";
        /**
         * getProjectGroupsByUnit
         * 	获取单位挂接的项目列表
         */
        public static String getProjectGroupsByUnit = base_url_host + "/getProjectGroupsByUnit";
        /**
         * getUserIntegrals
         * 获取 本人积分列表
         */
        public static String getUserIntegrals = base_url_host + "/getUserIntegrals";
        /**
         * getIntegralRankings
         * 获取 积分排名
         */
        public static String getIntegralRankings = base_url_host+"/getIntegralRankings";
        /**
         * getIntegralStatistics
         * 个人积分 项目 统计
         */
        public static String getIntegralStatistics = base_url_host+"/getIntegralStatistics";
        /**
         * getUserAchievements
         * 绩效排名 用户
         */
        public static String getUserAchievements = base_url_host+"/getUserAchievements";
        /**
         * getUnitAchievements
         * 获取公司绩效排名
         */
        public static String getUnitAchievements = base_url_host+"/getUnitAchievements";

        /**
         * getRewordWallet
         * 	获取项目公司奖励钱包详情(余额)
         */
        public static String getRewordWallet = base_url_host+"/rewordWallet";

        /**
         * createRewordWalletRecharge
         *  	创建并返回【充值】订单(仅公司id账户[level=10]可操作)
         */
        public static String createRewordWalletRecharge = base_url_host+"/createRewordWalletRecharge";
        /**
         * onOffUnitReword
         *  	开启/关闭项目公司奖励(大于0可开启) PUT
         */
        public static String onOffUnitReword = base_url_host+"/onOffUnitReword";
        /**
         * getRewordWalletModelSettings
         *  	获取项目公司奖励模块设置列表 Get
         */
        public static String getRewordWalletModelSettings = base_url_host+"/rewordWalletModelSettings";
        /**
         * updateRewordWalletModelSetting
         *  	修改项目公司奖励模块设置 PUT
         */
        public static String updateRewordWalletModelSetting = base_url_host+"/rewordWalletModelSetting";
        /**
         * updateRewordWalletRewordMoney
         *  	 	统一设置项目公司奖励金额（改变所有模块的奖励金额）PUT
         */
        public static String updateRewordWalletRewordMoney = base_url_host+"/rewordWalletRewordMoney";
        /**
         * getRewordWalletTransactions
         *  	 	获取项目公司奖励钱包交易明细列表（改变所有模块的奖励金额）get
         */
        public static String getRewordWalletTransactions = base_url_host+"/rewordWalletTransactions";
        /**
         * searchJtPatrol
         * 搜索检查
         */
        public static String searchJtPatrol = base_url_host+"/jintai/searchJtPatrol";
        /**
         * existSubUser
         * 	校验该岗位账户是否已存在
         */
        public static String existSubUser = base_url_host+"/existSubUser";
        /**
         * applySubUserAgain
         * 	子账号重新提交审核
         */
        public static String applySubUserAgain = base_url_host+"/applySubUserAgain";


        /**
         * 	是否支持北京建委资料归档功能
         */
        public static String isSupportBj = base_url_host+"/bj/isSupportBj";

        /**
         * 	获取可添加的北京建委模板列表(施工任务，施工报验)
         */
        public static String getCanAddTaskBjTemplates = base_url_host+"/bj/canAddTaskBjTemplates";

        /**
         * 	获取服务器时间
         */
        public static String getTime = base_url_host+"/open/time";

        /**
         * 	获取某模块任务的北京建委模板文件列表
         */
        public static String getModuleBjMimes = base_url_host+"/bj/moduleBjMimes";

        /**
         * getDigTemplateLists
         * 	获取模板列表
         */
        public static String getDigTemplateLists = base_url_host+"/bj/getDigTemplateLists";

        /**
         * getDigDataLists
         * 	获取资料列表
         */
        public static String getDigDataLists = base_url_host+"/bj/getDigDataLists";
        /**
         *  	searchDigDataLists
         * 	搜索资料列表
         */
        public static String  	searchDigDataLists = base_url_host+"/bj/searchDigDataLists";
        /**
         * getUserRewordStatisticsOfUnit
         * 获取公司奖励按人员统计情况
         */
        public static String getUserRewordStatisticsOfUnit = base_url_host+"/userRewordStatisticsOfUnit";
        /**
         *  	getProjects
         * 	获取北京建委的单体列表
         */
        public static String  	getBJProjects = base_url_host+"/bj/projects";
        /**
         *  	getProjects
         * 	获取某人可以上报北京建委的文件列表
         */
        public static String  	getCanReportBjMimes = base_url_host+"/bj/canReportBjMimes";
        /**
         *  	reportTemplateMimes
         * 	上报北京建委模板文件（批量、同公司的未上报的文件才可上报）【未完成】
         * PUT
         */
        public static String  	reportTemplateMimes = base_url_host+"/bj/reportTemplateMimes";

        /**
         *   getProjects
         *   获取招采公告列表
         */
        public static String getTenAnnLists = base_url_host+"/getTenAnnLists";
        /**
         *   addTenAnn
         *   添加或修改招采公告
         */
        public static String addTenAnn = base_url_host+"/addTenAnn";
        /**
         *   getTenAnnDetails
         *   添加或修改招采公告
         */
        public static String getTenAnnDetails = base_url_host+"/getTenAnnDetails";
        /**
         *   addTenAnnUnit
         *   添加报名单位
         */
        public static String addTenAnnUnit = base_url_host+"/addTenAnnUnit";
        /**
         *   getJtPatrolTaskProcess
         *   	获取质量检查的工作流程
         */
        public static String getJtPatrolTaskProcess = base_url_host+"/jintai/getJtPatrolTaskProcess";
        /**
         *   getJtPatrolBacklogCount
         *   	获取各个状态的待办数量
         */
        public static String getJtPatrolBacklogCount = base_url_host+"/jintai/getJtPatrolBacklogCount";

        /**
         *   	获取公司 部门列表（多维数组结构）
         */
        public static String getUnitDepartmentsMany = base_url_host+"/open/getUnitDepartmentsMany";

        /**
         * getTenAnnReceivedUnit
         *   	获取公告设置
         */
        public static String getTenAnnReceivedUnit = base_url_host+"/getTenAnnReceivedUnit";
        /**
         * setTenAnnReceivedUnit
         *   设置是否接收平台公告
         */
        public static String setTenAnnReceivedUnit = base_url_host+"/setTenAnnReceivedUnit";
        /**
         * createTenderEntryFeeOrder
         *   	创建并返回【招标公告报名费】订单
         */
        public static String createTenderEntryFeeOrder = base_url_host+"/createTenderEntryFeeOrder";

        /**
         * tenderingAdd
         * 	添加投标
         */
        public static String tenderingAdd = base_url_host+"/tenderingAdd";
        /**
         * 获取 资格审查类型 的招标信息
         * getTenderingPretrials
         */
        public static String getTenderingPretrials = base_url_host+"/getTenderingPretrials";
        /**
         * getTenderings
         * 获取 招标 信息列表
         */
        public static String getTenderings = base_url_host+"/getTenderings";
        /**
         * getBids
         * 获取 投标 信息列表
         */
        public static String getBids = base_url_host+"/getBids";
        /**
         * getTendering
         * 获取招标详情
         */
        public static String getTendering = base_url_host+"/getTendering";
        /**
         * submitQuestion
         * 提交答疑问题 加回复和提交待审核
         */
        public static String submitQuestion = base_url_host+"/submitQuestion";
        /**
         * getQuestion
         * 	获取答疑详情
         */
        public static String getQuestion = base_url_host+"/getQuestion";
        /**
         * getQuestions
         * 获取答疑列表
         */
        public static String getQuestions = base_url_host+"/getQuestions";
        /**
         * bidAddData
         * 添加 拟中标单位
         */
        public static String bidAddData = base_url_host+"/bidAdd";
        /**
         * OpenTheBid
         * 开标
         */
        public static String openTheBid = base_url_host+"/OpenTheBid";
        /**
         * auditorBid
         * 	审核定标信息
         */
        public static String auditorBid = base_url_host+"/auditorBid";
        /**
         * submissionBid
         * 申请定标 直接定标
         */
        public static String submissionBid = base_url_host+"/submissionBid";

        /**
         * 获取施工任务可以分配的单位及用户
         */
        public static String getCanAssignUnitUsers = base_url_host+"/canAssignUnitUsers";

        /**
         * 添加任务分享记录
         */
        public static String addTaskShare = base_url_host+"/taskShare";


        /**
         * 完成任务分享记录
         */
        public static String finishTaskShare = base_url_host+"/finishTaskShare";
        /**
         * putQuestionClose
         * 关闭 答疑
         */
        public static String putQuestionClose = base_url_host+"/putQuestionClose";
        /**
         * auditorQuestion
         * 审核答疑
         */
        public static String auditorQuestion = base_url_host+"/auditorQuestion";
        /**
         * questionBatchOperation
         * 批量操作 答疑 （提交答疑 ， 发布答疑）
         */
        public static String questionBatchOperation = base_url_host+"/questionBatchOperation";

        /**
         * getProjectsFromBjjw
         *  	获取北京建委的单体列表（只跟建委单体相关）
         */
        public static String getProjectsFromBjjw = base_url_host+"/bj/projectsFromBjjw";
        /**
         * linkBjjwProject
         *  	 	设置云图单体关联北京建委单体(支持新设，修改)
         */
        public static String linkBjjwProject = base_url_host+"/bj/linkBjjwProject";
        /**
         * updateDigDateInfo
         *  	 	更新资料的信息(建委归档，关联单体和编号信息)
         */
        public static String updateDigDateInfo = base_url_host+"/bj/updateDigDateInfo";
        /**
         * getUAVMimes
         *  	  	获取无人机 文件列表(GET)
         */
        public static String getUAVMimes = base_url_host+"/getUAVMimes";



        /**
         *  	 		获取我的任务分享列表
         */
        public static String getTaskShares = base_url_host+"/taskShares";
        /**
         *  	 	批量删除北京建委文件
         */
        public static String deleteBjMimes = base_url_host+"/bj/bjMimes";

        /**
         * searchTenAnnLists
         *  搜索公告列表
         */
        public static String searchTenAnnLists = base_url_host+"/searchTenAnnLists";

        /**
         *  获取可以关联共享的大准备任务列表(包含已经关联的任务)
         */
        public static String getCanLinkPreTasks = base_url_host+"/canLinkPreTasks";


        /**
         * searchQuestions
         *条件 搜索 答疑列表
         */
        public static String searchQuestions = base_url_host+"/searchQuestions";
        /**
         * searchTenderings
         * 根据检索条件 获取 招投标列表
         */
        public static String searchTenderings = base_url_host+"/searchTenderings";
        /**
         * addTenderingSituationTitle
         * 添加 招投标 50项一览表 标题
         */
        public static String addTenderingSituationTitle = base_url_host+"/addTenderingSituationTitle";
        /**
         * delTenderingSituationTitleAll
         * 删除 情况一览表 标题 全部清空
         */
        public static String delTenderingSituationTitleAll = base_url_host+"/delTenderingSituationTitleAll";
        /**
         * addTenderingSituationContent
         * 添加 招投标 50项一览表 内容（投标方）
         */
        public static String addTenderingSituationContent = base_url_host+"/addTenderingSituationContent";
        /**
         * getFaultTypes
         * 获取物业故障类型列表
         */
        public static String getFaultTypes = base_url_host+"/wy/open/faultTypes";
        /**
         * getWorkOrderAuth
         * 获取物业工单权限
         */
        public static String getWorkOrderAuth = base_url_host+"/wy/workOrderAuth";
        /**
         * addWyWorkOrder
         * 添加工单
         */
        public static String addWyWorkOrder = base_url_host+"/wy/workOrder";
        /**
         * getWorkOrderMembers
         * 获取物业工单小组成员列表
         */
        public static String getWorkOrderMembers = base_url_host+"/wy/workOrderMembers";
        /**
         * getWyWorkOrderPublishList
         * 获取我发布的工单列表
         */
        public static String getWyWorkOrderPublishList = base_url_host+"/wy/workOrderPublishList";
        /**
         * getWyWorkOrderAssigningBacklogs
         * 获取工单待办列表-待接单/待分配 (成员及以上可操作1+)
         */
        public static String getWyWorkOrderAssigningBacklogs = base_url_host+"/wy/workOrderAssigningBacklogs";
        /**
         * getWyWorkOrderExecutingBacklogs
         * 获取工单待办列表-待处理(成员及以上可操作1+)
         */
        public static String getWyWorkOrderExecutingBacklogs = base_url_host+"/wy/workOrderExecutingBacklogs";
        /**
         * getWyWorkOrderInfo
         * 获取工单信息(仅有工单信息，不含维修、费用等)
         */
        public static String getWyWorkOrderInfo = base_url_host+"/wy/workOrderInfo";
        /**
         * grapWorkOrder
         * 抢单(成员及以上可操作1+)
         */
        public static String grapWyWorkOrder = base_url_host+"/wy/grapWyWorkOrder";
        /**
         * assignWyWorkOrder
         * 	派单(管理员可操作 2+)
         */
        public static String assignWyWorkOrder = base_url_host+"/wy/assignWyWorkOrder";
        /**
         * getWyWorkOrderDetail
         * 		获取工单详情
         */
        public static String getWyWorkOrderDetail = base_url_host+"/wy/workOrderDetail";
        /**
         * suspendWyWorkOrder
         * 	挂起工单(执行人)
         */
        public static String suspendWyWorkOrder = base_url_host+"/wy/suspendWyWorkOrder";
        /**
         * cancelSuspendWyWorkOrder
         * 	解除挂起工单(执行人)
         */
        public static String cancelSuspendWyWorkOrder = base_url_host+"/wy/cancelSuspendWyWorkOrder";
        /**
         * finishRepairWyWorkOrder
         * 	工单维修完成(执行人可操作)
         */
        public static String finishRepairWyWorkOrder = base_url_host+"/wy/finishRepairWyWorkOrder";
        /**
         * checkWyWorkOrder
         * 	审核工单（创建人可操作）
         */
        public static String checkWyWorkOrder = base_url_host+"/wy/checkWyWorkOrder";
        /**
         * appraiseWyWorkOrder
         * 		评价工单（创建人可评价）
         */
        public static String appraiseWyWorkOrder = base_url_host+"/wy/appraiseWyWorkOrder";
        /**
         * getWorkOrders
         * 	获取工单列表(工单跟踪等使用,管理员看所有 其他看自己发布的)
         */
        public static String getWorkOrders = base_url_host+"/wy/workOrders";
        /**
         * getWyWorkOrderQuantityStatistics
         * 	获取工单统计——数量
         */
        public static String getWyWorkOrderQuantityStatistics = base_url_host+"/wy/wyWorkOrderQuantityStatistics";
        /**
         * getWyWorkOrderManHoursStatistics
         * 	获取工单统计——工时
         */
        public static String getWyWorkOrderManHoursStatistics = base_url_host+"/wy/wyWorkOrderManHoursStatistics";
        /**
         * addWorkOrderMembers
         * 	添加物业工单小组成员（2管理员可加成员，3超级管理员可加管理员/成员）
         */
        public static String addWorkOrderMembers = base_url_host+"/wy/workOrderMembers";
        /**
         * getCanAddMemberUsers
         * 获取可以添加到为物业工单小组中的用户列表
         */
        public static String getCanAddMemberUsers = base_url_host+"/wy/canAddMemberUsers";
        /**
         * deleteWorkOrderMembers
         * 删除小组成员(更高级可删除)
         */
        public static String deleteWorkOrderMembers = base_url_host+"/wy/workOrderMembers";
        /**
         * handOverWyWorkOrder
         * 	转单（执行人可转单，仅可转给未接单的平级人员）
         */
        public static String handOverWyWorkOrder = base_url_host+"/wy/handOverWyWorkOrder";
        /**
         * updateMemberFaultTypes
         * 	修改小组成员支持的故障类型(更高级，或本人可修改)
         */
        public static String updateMemberFaultTypes = base_url_host+"/wy/memberFaultTypes";
        /**
         * addWyWorkOrderAssistants
         * 添加协助人、配合人 （执行人可添加,只能分给无工单的小组成员）
         */
        public static String addWyWorkOrderAssistants = base_url_host+"/wy/workOrderAssistants";

        /**
         * 查看任务状态
         */
        public static String getTaskStatus = base_url_host+"/taskStatus";

        /**
         * getMarkSupervisorNotices
         * 获取标记下的监理通知列表
         */
        public static String getMarkSupervisorNotices = base_url_host+"/getMarkSupervisorNotices";
        /**
         * getWorkExcuteList
         * 	获取我处理的工单列表(历史工单等使用)[小组成员以上可操作 1+]
         */
        public static String getWorkExcuteList = base_url_host+"/wy/workOrderExcuteList";
        /**
         * getLatestAnnouncements
         * 	获取最近n条公告列表
         */
        public static String getLatestAnnouncements = base_url_host+"/jintai/latestAnnouncements";
        /**
         * getMakeAnAppointmentTypes
         * 		获取 预约类型列表
         */
        public static String getMakeAnAppointmentTypes = base_url_host+"/open/getMakeAnAppointmentTypes";
        /**
         * addMakeAnAppointment
         * 		添加预约
         */
        public static String addMakeAnAppointment = base_url_host+"/open/addMakeAnAppointment";
        /**
         * getMakeAnAppointments
         * 预约列表
         */
        public static String getMakeAnAppointments = base_url_host+"/open/getMakeAnAppointments";
        /**
         * getMakeAnAppointment
         * 预约详情
         */
        public static String getMakeAnAppointment = base_url_host+"/open/getMakeAnAppointment";
        /**
         * putMakeAnAppointment
         * 修改预约
         */
        public static String putMakeAnAppointment = base_url_host+"/open/putMakeAnAppointment";
        /**
         * cancelMakeAnAppointment
         * 	取消预约
         */
        public static String cancelMakeAnAppointment = base_url_host + "/open/cancelMakeAnAppointment";
        /**
         * getHtBaseInfoList
         * 获取基本信息列表(GET)
         */
        public static String getHtBaseInfoList = base_url_host + "/getHtBaseInfoList";
        /**
         * searchBaseInfoList
         * 搜索合同(GET)
         */
        public static String searchBaseInfoList = base_url_host + "/searchBaseInfoList";
        /**
         * getHtDynamicBqqList
         * 获取动态变化-变洽签列表(GET)
         */
        public static String getHtDynamicBqqList = base_url_host + "/getHtDynamicBqqList";

        /**
         * getHtDynamicBqqDetails
         * 获取动态变化-变洽签详情(GET)
         */
        public static String getHtDynamicBqqDetails = base_url_host + "/getHtDynamicBqqDetails";

        /**
         * getHtDynamicMemoList
         * 获取动态变化-补充协议与备忘录列表(GET)
         */
        public static String getHtDynamicMemoList = base_url_host + "/getHtDynamicMemoList";

        /**
         * getHtDynamicMemoDetails
         * 获取动态变化-补充协议与备忘录详情(GET)
         */
        public static String getHtDynamicMemoDetails = base_url_host + "/getHtDynamicMemoDetails";

        /**
         * getHtDynamicRewardList
         * 获取动态变化-索赔与奖励列表(GET)
         */
        public static String getHtDynamicRewardList = base_url_host + "/getHtDynamicRewardList";

        /**
         * getHtDynamicRewardDetails
         * 获取动态变化-索赔与奖励详情(GET)
         */
        public static String getHtDynamicRewardDetails = base_url_host + "/getHtDynamicRewardDetails";
        /**
         * getHtApproveDetails
         * 获取申请详情(GET)
         */
        public static String getHtApproveDetails = base_url_host + "/getHtApproveDetails";
        /**
         * getHtBaseInfoDetails
         * 获取合同基本信息详情(GET)
         */
        public static String getHtBaseInfoDetails = base_url_host + "/getHtBaseInfoDetails";
        /**
         * getHtApproveList
         * 获取付款申请记录列表(GET)
         */
        public static String getHtApproveList = base_url_host + "/getHtApproveList";
        /**
         * getHtApproveList
         * 获取付款申请记录列表(GET)
         */
        public static String getHtApprovePayMehotd = base_url_host + "/getHtApprovePayMehotd";
        /**
         * getHtApproveSetting
         * 获取合同付款申请流程设置(GET)
         */
        public static String getHtApproveSettingOfUser = base_url_host + "/getHtApproveSettingOfUser";
        /**
         * addHtApprove
         * 添加付款申请(POST)
         */
        public static String addHtApprove = base_url_host + "/addHtApprove";
        /**
         * getHtValuationList
         * 获取工程计价列表(GET)
         */
        public static String getHtValuationList = base_url_host + "/getHtValuationList";
        /**
         * getHtValuationDetails
         * 获取工程计价详情(GET)
         */
        public static String getHtValuationDetails = base_url_host + "/getHtValuationDetails";
        /**
         * getHtSettlementList
         * 获取结算管理列表(GET)
         */
        public static String getHtSettlementList = base_url_host + "/getHtSettlementList";
        /**
         * getHtSettlementDetails
         * 获取结算详情(GET)
         */
        public static String getHtSettlementDetails = base_url_host + "/getHtSettlementDetails";
        /**
         * getHtApproveListByContract
         * 获取付款信息列表(GET)
         */
        public static String getHtApproveListByContract = base_url_host + "/getHtApproveListByContract";
        /**
         * getHtWarrantyList
         * 获取保修管理列表(GET)
         */
        public static String getHtWarrantyList = base_url_host + "/getHtWarrantyList";
        /**
         * getHtWarrantyDetails
         * 获取保修管理详情(GET)
         */
        public static String getHtWarrantyDetails = base_url_host + "/getHtWarrantyDetails";
        /**
         * confirmHtAprrove
         * 付款申请审批，付款(POST)
         */
        public static String confirmHtAprrove = base_url_host + "/confirmHtAprrove";
        /**
         * getHtUserAuthority
         * 获取用户权限(GET)
         */
        public static String getHtUserAuthority = base_url_host + "/getHtUserAuthority";
        /**
         * getHtGroupAndUsers
         * 获取小组以及小组内人员(GET)
         */
        public static String getHtGroupAndUsers = base_url_host + "/getHtGroupAndUsers";
        /**
         * getHtUserOfUnit
         * 获取在项目中的单位人员(GET)
         */
        public static String getHtUserOfUnit = base_url_host + "/getHtUserOfUnit";
        /**
         * getHtUserOfContract
         * 获取有权限查看该类型的合同的人员(GET)
         */
        public static String getHtUserOfContract = base_url_host + "/getHtUserOfContract";
        /**
         * addHtAdministrator
         * 添加、删除管理员(POST)
         */
        public static String addHtAdministrator = base_url_host + "/addHtAdministrator";
        /**
         * searchHtDynamicBqqList
         * 搜索动态变化变洽签情况(GET)
         */
        public static String searchHtDynamicBqqList = base_url_host + "/searchHtDynamicBqqList";

        /**
         * searchHtDynamicRewardList
         * 搜索索赔与奖励(GET)
         */
        public static String searchHtDynamicRewardList = base_url_host + "/searchHtDynamicRewardList";
        /**
         * searchHtDynamicMemoList
         * 搜索动态变化补充协议与备忘录(GET)
         */
        public static String searchHtDynamicMemoList = base_url_host + "/searchHtDynamicMemoList";
        /**
         * searchHtValuationList
         * 搜索工程计价(GET)
         */
        public static String searchHtValuationList = base_url_host + "/searchHtValuationList";
        /**
         * searchHtWarrantyList
         * 搜索保修管理(GET)
         */
        public static String searchHtWarrantyList = base_url_host + "/searchHtWarrantyList";
        /**
         * getHtBaseInfoOptions
         * 获取基本信息选择项(GET)
         */
        public static String getHtBaseInfoOptions = base_url_host + "/getHtBaseInfoOptions";
        /**
         * getHtDynamicBqqOptions
         *  	获取动态变化-变洽签选择项列表(GET)
         */
        public static String getHtDynamicBqqOptions = base_url_host + "/getHtDynamicBqqOptions";
        /**
         * getHtDynamicRewardOptions
         *  	 	获取动态变化-索赔与奖励选择项列表(GET)
         */
        public static String getHtDynamicRewardOptions = base_url_host + "/getHtDynamicRewardOptions";
        /**
         * searchHtApproveList
         * 搜索付款信息(GET)
         */
        public static String searchHtApproveList = base_url_host + "/searchHtApproveList";
        /**
         * getBLHtApproveList
         * 获取合同管理申请的待办列表(GET)
         */
        public static String getBLHtApproveList = base_url_host + "/getBLHtApproveList";
        /**
         * getHtBacklogCount
         * 获取合同管理的待办数量(GET)
         */
        public static String getHtBacklogCount = base_url_host + "/getHtBacklogCount";
        /**
         * getHtBacklogCount
         * 获取合同的接收列表(GET)
         */
        public static String getHtReceivedList = base_url_host + "/getHtReceivedList";
        /**
         * shareHt
         * 获取合同的接收列表(POST)
         */
        public static String shareHt = base_url_host + "/shareHt";

        /**
         * getSccBacklogCount
         * 获取安全检查待办数量(GET)
         */
        public static String getSccBacklogCount = base_url_host + "/getSccBacklogCount";
        /**
         * getSafetyAccBacklogCount
         * 获取安全验收待办数量(GET)
         */
        public static String getSafetyAccBacklogCount = base_url_host + "/getSafetyAccBacklogCount";

        /**
         * getBLSccTaskList
         * 获取安全检查待办列表(GET)
         */
        public static String getBLSccTaskList = base_url_host + "/getBLSccTaskList";
        /**
         * getBLSafetyAccTaskList
         * 获取安全检查待办列表(GET)
         */
        public static String getBLSafetyAccTaskList = base_url_host + "/getBLSafetyAccTaskList";

        /**
         * PutTenderingTime
         * 招投标  修改时间
         */
        public static String putTenderingTime = base_url_host+"/PutTenderingTime";

        /**
         * 添加监理通知(支持项目，单体、任务发起通知) v2
         */
        public static String addNoticeV2 = base_url_host+"/v2/addNotice";


        /**
         * 获取通知列表 V2
         */
        public static String getPhoneNoticesV2 = base_url_host+"/v2/phoneNotices";

        /**
         * 	获取通知详情 V2
         */
        public static String getNoticeDetailV2 = base_url_host+"/v2/noticeDetail";
        /**
         * 接收方分派人员 V2
         */
        public static String assignNoticeV2 = base_url_host+"/v2/assignNotice";

        /**
         * 通知回复 V2(1已发送 7被驳回可回复;reply_user&amp;gt;0时回复人可修改，1/2级仅可签字)
         */
        public static String replyNoticeV2 = base_url_host+"/v2/replyNotice";


        /**
         * 通知复检V2(发起人可复检)
         */
        public static String recheckNoticeV2 = base_url_host+"/v2/recheckNotice";

        /**
         * 通知销项V2(发起人，总监可销项)
         */
        public static String outputNoticeV2 = base_url_host+"/v2/outputNotice";

        /**
         * 获取通知回复（复检、销项、驳回）记录 V2
         */
        public static String getNoticeRecords = base_url_host+"/v2/noticeRecords";
        /**
         *获取工程互联-安全管理数量提示
         */
        public static String getSafetyManagementCount = base_url_host+"/getSafetyManagementCount";
        /**
         * 接口名称：	getContacts
         * 接口用途：	管理动态-获取通讯录列表
         */
        public static String getContacts = base_url_host + "/rqjlzs/contacts";
        /**
         * 接口名称：	getProjectAdmins
         * 接口用途：	管理动态-获取单位工程与监理人员对应详情
         */
        public static String getProjectAdmins = base_url_host + "/rqjlzs/projectAdmins";
        /**
         * getStUnitOfProject
         * 获取某项目关联的施工单位列表
         */
        public static String getStUnitOfProject = base_url_host + "/rqjlzs/getStUnitOfProject";
        /**
         * 接口名称：	getProjectConstructors
         * 接口用途：	管理动态-获取单位工程与监理人员对应详情
         */
        public static String getProjectConstructors = base_url_host + "/rqjlzs/projectConstructors";
        /**
         * 接口名称：	getMyProjectGroups
         * 接口用途：	获取我的项目列表
         * method：	GET
         */
        public static String getMyProjectGroups = base_url_host + "/rqjlzs/myProjectGroups";
        /**
         * getStPGExamined
         * 	统计工程下1级检查项
         */
        public static String getStPGExamined = base_url_host+"/rqjlzs/getStPGExamined";
        /**
         * getStUserActiveLists
         * 获取用户活跃度
         */
        public static String getStUserActiveLists = base_url_host+"/rqjlzs/getStUserActiveLists";
        /**
         * 接口名称：	getPgUsers
         * 接口用途：	获取项目人员列表（一维列表）
         */
        public static String getPgUsers = base_url_host + "/rqjlzs/pgUsers";
        /**
         * 接口名称：	paths
         * 接口用途：	查询某人员某一天的轨迹
         */
        public static String paths = base_url_host + "/rqjlzs/paths";
        /**
         * 	管理动态-获取单位工程与监理人员对应详情(二级形式返回值+搜索)
         */
        public static String getProjectsAndAdmins = base_url_host+"/rqjlzs/projectsAndAdmins";
        /**
         * 	管理动态-获取单位工程与施工单位对应详情(二级形式返回值+搜索)
         */
        public static String getProjectsAndConstructors = base_url_host+"/rqjlzs/projectsAndConstructors";
        /**
         * 接口用途：	交底列表
         */
        public static String discloses = base_url_host + "/rqjlzs/discloses";
        /**
         * 接口用途：	交底详情
         */
        public static String getDiscloseDetail = base_url_host + "/rqjlzs/disclose";
        /**
         * 接口用途：	交底添加
         */
        public static String discloseAdd = base_url_host + "/rqjlzs/discloseAdd";
        /**
         * 接口用途：	获取 未交底的单位工程
         */
        public static String discloseProjects = base_url_host + "/rqjlzs/discloseProjects";
        /**
         * 接口名称：	acceptanceProject
         * 接口用途：	获取 未验收合格的单位工程
         */
        public static String acceptanceProject = base_url_host + "/rqjlzs/acceptanceProject";
        /**
         * getStPerOfProject
         * 获取工程量完成率
         */
        public static String getStPerOfProject = base_url_host + "/rqjlzs/getStPerOfProject";
        /**
         * getStPerOfProject
         * 获取不合格检查项
         */
        public static String getStDisOfProject = base_url_host + "/rqjlzs/getStDisOfProject";
        /**
         * getStPerOfProjectGroup
         * 获取单位工程完成率
         */
        public static String getStPerOfProjectGroup = base_url_host + "/rqjlzs/getStPerOfProjectGroup";
        /**
         * 接口名称：	getStTaskInfoDetails
         * 接口用途：	获取不合格检查项列表
         */
        public static String getStTaskInfoDetails = base_url_host + "/rqjlzs/getStTaskInfoDetails";
        /**
         * 接口名称：	getStDisLists
         * 接口用途：	获取不合格检查项列表
         */
        public static String getStDisLists = base_url_host + "/rqjlzs/getStDisLists";
        /**
         * 接口名称：	updateInspection
         * 接口用途：	人员报验 修改人员信息
         */
        public static String updateInspection = base_url_host + "/rqjlzs/updateInspection";
        /**
         * 接口名称：	getInspection
         * 接口用途：	人员报验 获取人员信息
         */
        public static String getInspection = base_url_host + "/rqjlzs/getInspection";
        /**
         * 接口名称：	inspections
         * 接口用途：	人员报验 查询人员报验列表
         */
        public static String inspections = base_url_host + "/rqjlzs/inspections";
        /**
         * 接口名称：	acceptances
         * 接口用途：	验收列表
         */
        public static String acceptances = base_url_host + "/rqjlzs/acceptances";
        /**
         * 接口名称：	acceptance
         * 接口用途：	验收详情
         */
        public static String getAcceptanceDetail = base_url_host + "/rqjlzs/acceptance";
        /**
         * 接口名称：	acceptanceAdd
         * 接口用途：	验收添加
         */
        public static String acceptanceAdd = base_url_host + "/rqjlzs/acceptanceAdd";
        /**
         * getStProjectIsFinish
         * 判断某村是否可完成
         */
        public static String getStProjectIsFinish = base_url_host+"/rqjlzs/getStProjectIsFinish";
        /**
         * acceptanceApproval
         * 验收 审核
         */
        public static String acceptanceApproval = base_url_host+"/rqjlzs/acceptanceApproval";
        /**
         * 接口名称：	getImageData
         * 接口用途：	获取影像资料详情
         */
        public static String getImageData = base_url_host + "/rqjlzs/imageData";
        /**
         * 接口名称：getMyProjects
         * 接口用途：获取我管理的单位工程列表
         */
        public static String getMyProjects = base_url_host + "/myProjects";
        /**
         * 接口名称：	getImageDatas
         * 接口用途：	获取影像资料列表
         */
        public static String getImageDatas = base_url_host + "/rqjlzs/imageDatas";
        /**
         * 接口名称：	getDenerateDocuments
         * 接口用途：	资料管理-获取通知单/生成资料列表
         */
        public static String getDenerateDocuments = base_url_host + "/rqjlzs/denerateDocuments";
        /**
         * 接口名称：	getPgUnitUsers
         * 接口用途：	获取项目人员列表（按公司分组显示 二维列表）
         */
        public static String getPgUnitUsers = base_url_host + "/rqjlzs/pgUnitUsers";
        /**
         * 	获取资料列表
         */
        public static String getRefAdminLists = base_url_host+"/rqjlzs/getRefAdminLists";
        /**
         * 接口名称：	notices
         * 接口用途：	通知 待办
         */
        public static String notices = base_url_host + "/rqjlzs/notices";
        /**
         * getSceneTaskListDes
         * 获取模板任务详情
         */
        public static String getSceneTaskListDes = base_url_host + "/rqjlzs/getSceneTaskListDes";
        /**
         * 接口名称：	getSTCheckedInfo
         * 接口用途：	获取模板任务详情（仅参与检查的项）
         */
        public static String getSTCheckedInfo = base_url_host + "/rqjlzs/getSTCheckedInfo";
        /**
         * getSceneTemlateDes
         * 获取模板详情
         */
        public static String getSceneTemlateDes = base_url_host + "/rqjlzs/getSceneTemlateDes";
        /**
         * addSceneTaskInfo
         * 添加编辑完成的模板信息
         */
        public static String addSceneTaskInfo = base_url_host + "/rqjlzs/addSceneTaskInfo";
        /**
         * getSceneListsById
         * 根据模板序号，获取对应下拉列表
         */
        public static String getSceneListsById = base_url_host + "/rqjlzs/getSceneListsById";
        /**
         * getSceneTaskListsById
         * 	根据任务id获取包内模板任务列表
         */
        public static String getSceneTaskListsById = base_url_host+"/rqjlzs/getSceneTaskListsById";
        /**
         * addSceneTask
         * 提交当日任务
         */
        public static String addSceneTask = base_url_host + "/rqjlzs/addSceneTask";
        /**
         * updateSceneTaskInfo
         * 更新任务执行信息
         */
        public static String updateSceneTaskInfo = base_url_host + "/rqjlzs/updateSceneTaskInfo";
        /**
         * getSceneTemplateLists
         * 获取模板列表
         */
        public static String getSceneTemplateLists = base_url_host + "/rqjlzs/getSceneTemplateLists";
        /**
         * getSceneTaskInfoMimes
         * 获取任务详情某条目的文件
         */
        public static String getSceneTaskInfoMimes = base_url_host + "/rqjlzs/getSceneTaskInfoMimes";
        /**
         * deleteSceneFiles
         * 删除现场管理文件
         */
        public static String deleteSceneFiles = base_url_host+"/rqjlzs/deleteSceneFiles";
        /**
         * 接口名称：	删除
         */
        public static String noticeDel = base_url_host + "/rqjlzs/noticeDel";
        /**
         * 接口名称：	saveNoticeTemplate
         * 接口用途：	通知单 签名 保存 发送，关闭接口
         */
        public static String saveNoticeTemplate = base_url_host + "/rqjlzs/saveNoticeTemplate";
        /**
         * getSceneTasks
         * 获取当日打包任务列表
         */
        public static String getSceneTasks = base_url_host+"/rqjlzs/getSceneTasks";
        /**
         * 	资料管理-获取某年某月有资料的日期（工程师仅看自己的）
         */
        public static String getDocumentDays = base_url_host+"/rqjlzs/documentDays";
        /**
         * 	影像资料-获取某年某月有资料的日期
         */
        public static String getImageDataDays = base_url_host+"/rqjlzs/imageDataDays";
        /**
         * getExtraNoticeProjectStatics
         * 获取通知管理统计
         */
        public static String getExtraNoticeProjectStatics = base_url_host+"/open/extraNoticeProjectStatics";
        /**
         * getKaoQinDepts
         * 获得门禁数据库部门列表
         */
        public static String getKaoQinDepts = base_url_host+"/kaoQinDepts";

        /**
         * setkaoQinDepts
         * 获得门禁数据库部门列表
         */
        public static String setkaoQinDepts = base_url_host+"/setkaoQinDepts";

        /**
         * 获取 用户类别
         */
        public static String getUserSpeciaty = base_url_host+"/open/getUserSpeciaty";


        /**
         * 获取 劳务人员列表
         */
        public static String getLabourServicesUsers = base_url_host+"/getLabourServicesUsers";

        /**
         * 获取 合同条款
         */
        public static String getContractClause = base_url_host+"/getContractClause";

        /**
         * 签订合同 或 续签合同
         */
        public static String contractAdd = base_url_host+"/contractAdd";
        /**
         * 获取用户 签订合同列表
         */
        public static String getSignContract = base_url_host+"/getSignContract";
        /**
         * 签订合同
         */
        public static String signContract = base_url_host+"/signContract";
        /**
         *结束合同
         */
        public static String endContract = base_url_host+"/endContract";
        /**
         *获取过程检查各状态数量
         */
        public static String getPatrolThirdListCount = base_url_host+"/longhu/getPatrolThirdListCount";
        /**
         *获取过程检查待办列表
         */
        public static String getBLPatrolThirdTaskList = base_url_host+"/getBLPatrolThirdTaskList";
        /**
         *获取过程检查统计报表
         */
        public static String getPatrolStatisticForGroup = base_url_host+"/getPatrolStatisticForGroup";

        /**
         * 获取项目列表
         */
        public static String getRanqiProjects = base_url_host+"/rqjlzs/projects";
        /**
         * 添加轨迹 监理/总监可添加
         */
        public static String addRanqiPath = base_url_host + "/rqjlzs/addPath";
        /**
         * getBLOfSceneTaskLists
         * 获取现场管理的待执行任务
         */
        public static String getBLOfSceneTaskLists = base_url_host+"/rqjlzs/getBLOfSceneTaskLists";
        /**
         * 接口名称：	updateBLSceneTask
         * 接口用途：	重新提交当日任务
         */
        public static String updateBLSceneTask = base_url_host + "/rqjlzs/updateBLSceneTask";
        /**
         * 接口名称：	confirmBLOfSceneTask
         * 接口用途：	确认或驳回现场管理任务
         */
        public static String confirmBLOfSceneTask = base_url_host + "/rqjlzs/confirmBLOfSceneTask";
        /**
         * 接口名称：	getBLOfSTListsByTaskId
         * 接口用途：	根据任务id，获取模板任务列表
         */
        public static String getBLOfSTListsByTaskId = base_url_host + "/rqjlzs/getBLOfSTListsByTaskId";
        /**
         * 	获取复检任务的列表
         */
        public static String getBLRecheckTaskLists = base_url_host+"/rqjlzs/getBLRecheckTaskLists";
        /**
         * 	完成复检任务
         */
        public static String updateBLRecheckTask = base_url_host+"/rqjlzs/updateBLRecheckTask";
        /**
         * 	获取复检任务详情
         */
        public static String getBLRecheckTaskDetails = base_url_host+"/rqjlzs/getBLRecheckTaskDetails";
}

