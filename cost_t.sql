USE [lib_db]
GO
/****** Object:  Table [dbo].[cost_t]    Script Date: 2020/4/11 21:42:26 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cost_t](
	[BookNo] [nvarchar](10) NULL,
	[ReaderNo] [nvarchar](10) NULL,
	[BookName] [nvarchar](10) NOT NULL,
	[Author] [nvarchar](10) NULL,
	[BDate] [datetime] NOT NULL,
	[RDate] [datetime] NULL,
	[Money] [float] NULL
) ON [PRIMARY]
GO
