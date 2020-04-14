USE [lib_db]
GO
/****** Object:  Table [dbo].[管理员信息表]    Script Date: 2020/4/14 10:07:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[管理员信息表](
	[管理员编号] [nvarchar](10) NOT NULL,
	[管理员名称] [nvarchar](20) NULL,
	[密码] [nvarchar](20) NULL,
	[权限] [tinyint] NULL,
 CONSTRAINT [PK_管理员信息表] PRIMARY KEY CLUSTERED 
(
	[管理员编号] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
