USE [lib_db]
GO
/****** Object:  Table [dbo].[user_t]    Script Date: 2020/4/11 21:45:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[user_t](
	[ReaderNo] [nvarchar](10) NOT NULL,
	[ReaderName] [nvarchar](10) NULL,
	[Age] [smallint] NULL,
	[Sex] [char](2) NULL,
	[Number] [nvarchar](20) NULL,
	[Identity] [tinyint] NULL
) ON [PRIMARY]
GO
