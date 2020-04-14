﻿USE [lib_db]
GO
/****** Object:  Table [dbo].[admin_t]    Script Date: 2020/4/14 10:07:02 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[admin_t](
	[UserNo] [nvarchar](10) NOT NULL,
	[UserName] [nvarchar](20) NULL,
	[Password] [nvarchar](20) NULL,
	[Authority] [tinyint] NULL,
 CONSTRAINT [PK_admin_t] PRIMARY KEY CLUSTERED 
(
	[UserNo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO